package com.dicoding.exam.exam3

// TODO
fun <T> checkType(args: T): String {
    var dataType = ""
    when (args) {
        is String -> dataType = "String"
        is Int -> dataType = "Integer"
        is Boolean -> dataType = "Boolean"
        is Double -> dataType = "Double"
        is List<*> -> dataType = "List"
        is Map<*, *> -> dataType = "Map"
    }

    return "Yes! it's $dataType"
}