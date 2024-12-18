package com.example.differentflavorspractice.helpers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class CHTitleTextStrategy : TitleTextStrategy {
    override fun textSize() = 18.sp
    override fun textWeight() = FontWeight.Bold
    override fun color() = Color.Red
}

