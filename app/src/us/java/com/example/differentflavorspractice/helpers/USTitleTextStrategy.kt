package com.example.differentflavorspractice.helpers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class USTitleTextStrategy : TitleTextStrategy {
    override fun textSize() = 12.sp
    override fun textWeight() = FontWeight.Thin
    override fun color() = Color.Red
}

