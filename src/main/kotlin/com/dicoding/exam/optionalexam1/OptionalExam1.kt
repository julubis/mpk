package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    val sum = numbers.sorted().takeLast(3).sum()
    return sum
}
