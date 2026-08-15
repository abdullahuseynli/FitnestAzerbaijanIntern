package com.example.fitnestazerbaijanintern.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.QrCodeScanner
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnestazerbaijanintern.ui.theme.BackgroundLight
import com.example.fitnestazerbaijanintern.ui.theme.CyanPrimary
import com.example.fitnestazerbaijanintern.ui.theme.TextPrimary
import com.example.fitnestazerbaijanintern.ui.theme.TextSecondary

@Composable
fun QrScannerScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundLight)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "QR Oxuducu",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = TextPrimary,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(60.dp))

        // QR Frame Mock
        Box(
            modifier = Modifier
                .size(260.dp)
                .background(Color.White, RoundedCornerShape(24.dp))
                .border(2.dp, CyanPrimary, RoundedCornerShape(24.dp)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Outlined.QrCodeScanner,
                contentDescription = "QR Code",
                tint = CyanPrimary,
                modifier = Modifier.size(140.dp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Zala daxil olmaq üçünturniketin QR kodunu çərçivəyə daxil edin",
            fontSize = 14.sp,
            color = TextSecondary,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 20.dp)
        )
    }
}