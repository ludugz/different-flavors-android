package com.example.differentflavorspractice.helpers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class JPTitleTextStrategy : TitleTextStrategy {
    override fun textSize() = 24.sp
    override fun textWeight() = FontWeight.Bold
    override fun color() = Color.Green
}

