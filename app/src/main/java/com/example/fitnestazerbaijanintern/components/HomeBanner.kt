package com.example.fitnestazerbaijanintern.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnestazerbaijanintern.ui.theme.BlueLinear
import com.example.fitnestazerbaijanintern.ui.theme.PurpleLinear

@Composable
fun HomeBanner(
    title: String,
    subtitle: String,
    buttonText: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val gradient = Brush.horizontalGradient(
        colors = listOf(BlueLinear, PurpleLinear)
    )

    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(brush = gradient, shape = RoundedCornerShape(22.dp))
            .padding(20.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth(0.65f)) {
            Text(
                text = title,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = subtitle,
                fontSize = 12.sp,
                color = Color.White.copy(alpha = 0.8f)
            )
            Spacer(modifier = Modifier.height(14.dp))


            GradientButton(
                text = buttonText,
                onClick = onClick,
                modifier = Modifier
                    .width(95.dp)
                    .height(35.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeBannerPreview() {
    HomeBanner(
        title = "BMI (Body Mass Index)",
        subtitle = "You have a normal weight",
        buttonText = "View More",
        onClick = {}
    )
}