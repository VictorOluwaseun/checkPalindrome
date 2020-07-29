package com.decagon.assignments

fun checkPalindrome(input: String): Boolean{
    var isNumeric: Boolean = false;
    try {
        // Check if the input is empty
        if (input.isEmpty() || input.toInt()::class.simpleName=="Int"){
            return false
        }
        // Catch NumberFormatException
    } catch (e: NumberFormatException){
        isNumeric = false
    }
    // Check if it is numeric
    if (isNumeric)
        return false

    // Get result from isPalindrome. isPalindrome returns true, if the input is palindrome and vice versa
    var result = isPalindrome(input)
    // Print to the console if needed
    println(result)
    // Return the value
    return result
}

// The isPalindrome function
fun isPalindrome(str: String): Boolean{
    // newStr variable to collect new string
    var newStr = ""
    // formatStr variable to format the string
    var formatStr = "";
    // Loop through the string to eliminate space
    for (s in str)
        if (s.toString() != " " )
            formatStr += s
    formatStr = formatStr.toLowerCase().trim() // convert to lowercase
    // Concat from the end to check if it is a palindrome
    for (i in formatStr.length-1 downTo 0){
        newStr+=formatStr[i]
    }
    // Return true if it is a palindrome, false it is not
    return newStr.isNotEmpty() && formatStr == newStr
}