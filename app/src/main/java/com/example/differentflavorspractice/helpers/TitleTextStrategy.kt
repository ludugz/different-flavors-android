package com.example.differentflavorspractice.helpers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

interface TitleTextStrategy {
    fun textSize(): TextUnit
    fun textWeight(): FontWeight
    fun color(): Color
}