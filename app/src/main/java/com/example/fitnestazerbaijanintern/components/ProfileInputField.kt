package com.example.fitnestazerbaijanintern.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnestazerbaijanintern.ui.theme.BorderStroke
import com.example.fitnestazerbaijanintern.ui.theme.CyanPrimary
import com.example.fitnestazerbaijanintern.ui.theme.TextPrimary
import com.example.fitnestazerbaijanintern.ui.theme.TextSecondary

@Composable
fun ProfileInputField(
    label: String,
    value: String,
    leadingIcon: ImageVector,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = label,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = TextPrimary
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
                .background(Color.White, shape = RoundedCornerShape(26.dp))
                .border(1.dp, BorderStroke, shape = RoundedCornerShape(26.dp))
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = leadingIcon,
                contentDescription = null,
                tint = CyanPrimary
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = value,
                fontSize = 14.sp,
                color = TextPrimary,
                modifier = Modifier.weight(1f)
            )
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Edit",
                tint = TextSecondary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileInputFieldPreview() {
    ProfileInputField(
        label = "Ad",
        value = "Leyla",
        leadingIcon = Icons.Outlined.Person
    )
}