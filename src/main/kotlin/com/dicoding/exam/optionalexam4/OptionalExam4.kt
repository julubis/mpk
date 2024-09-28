package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val mid = string.length / 2
    val middleChar = if (string.length % 2 == 1) {
        string.substring(mid, mid + 1)
    } else {
        string.substring(mid - 1, mid + 1)
    }

    return middleChar
}
