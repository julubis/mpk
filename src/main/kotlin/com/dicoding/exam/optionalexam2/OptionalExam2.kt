package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val numbers = number.toString().map {
        it.toString().toInt()
    }

    return numbers.max() + numbers.min()
}
