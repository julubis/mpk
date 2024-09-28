package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val string = str.filter { it.isLetter() }
    val number = str.filter { it.isDigit() }.trimStart('0').toIntOrNull()

    return "$string${(number ?: 1) * int}"
}
