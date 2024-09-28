package com.dicoding.exam.exam1

// TODO 1
fun isEvenNumber(number: Int): Boolean {
    val even = number % 2 == 0
    return even
}

// TODO 2
fun moreThanFive(number: Int): Boolean {
    val bool = number > 5
    return bool
}

// TODO 3
fun result(number: Int): Int {
    val num = number * (number + 10)
    return num
}
