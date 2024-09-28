package com.dicoding.exam.exam2

// TODO 1
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    val calc = valueA + valueB - (valueC ?: 50)
    return calc
}

// TODO 2
fun result(result: Int): String {
    return "Result is $result"
}
