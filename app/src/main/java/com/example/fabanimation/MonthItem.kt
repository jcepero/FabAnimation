package com.example.fabanimation

sealed class MonthItem

data class Header(
    val title: String
) : MonthItem()

data class Month(
    val month1: String,
    val month2: String?
) : MonthItem()
