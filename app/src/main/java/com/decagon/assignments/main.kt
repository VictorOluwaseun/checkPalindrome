//package com.decagon.assignments

import java.util.*

fun main() { // Main the entry function
    var fromConsole = true // If value is coming from the console

    var input = inputFromConsole()  // value from the console
    checkPalindrome(input) // Call checkCalindrome function
}

// checkPalindrome function
fun checkPalindrome(str: String): Boolean{
    var fromConsole = false;  // Not coming from the console
    var input = str
    var isNumeric: Boolean = false;
    try {
        //
        while (input.isEmpty() || input.toInt()::class.simpleName=="Int"){
            if (!fromConsole) return false
            println("Enter a valid input. i.e string")
            input = inputFromConsole()
        }
    } catch (e: NumberFormatException){
        isNumeric = false
    }
    if (isNumeric){
        while (isNumeric){
            println("You entered number, enter a valid input. i.e string")
            if (!fromConsole && !isNumeric) return false
            input = inputFromConsole()
            isNumeric = input::class.simpleName == "Int"
        }
    }
    var result = isPalindrome(input)
    println(result)
    return result
}

fun inputFromConsole(): String{
    println("Please Enter a String")
    var scanner = Scanner(System.`in`)
    return scanner.nextLine()
}

fun isPalindrome(str: String): Boolean{
    var newStr = ""
    var formatStr = "";

    for (s in str)
        if (s.toString() != " " )
            formatStr += s

    formatStr = formatStr.toLowerCase().trim()

    for (i in formatStr.length-1 downTo 0){
        if (formatStr[i].toString() == " ")
            continue
        newStr+=formatStr[i]
    }
    return formatStr == newStr
}