package com.decagon.assignments

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
//    @Test
//    fun addition_isCorrect() {
//        assertEquals(4, 2 + 2)
//    }

    @Test
    fun short_word(){
        assertEquals(false, checkPalindrome("some"))
    }

    @Test
    fun empty_string(){
        assertEquals(false, checkPalindrome(""))
    }

    @Test
    fun whitespace(){
        assertEquals(false, checkPalindrome(" "))
    }

    @Test
    fun test_special_char(){
        assertEquals(false, checkPalindrome("A man, a plan, a canal – Panama"))
    }

    @Test
    fun short_correct_word(){
        assertEquals(true, checkPalindrome("madam"))
    }

    @Test
    fun long_wrong_word(){
        assertEquals(false, checkPalindrome("I am going to school"))
    }

    @Test
    fun long_correct_word(){
        assertEquals(true,checkPalindrome("Was it a cat I saw"))
    }

    @Test
    fun long_correct_word_mixed_uppercase(){
        assertEquals(true, checkPalindrome("Was it a car or a cat I saw"))
    }

    @Test
    fun test_with_extra_spaces(){
        assertEquals(true, checkPalindrome("   ra ce car "))
    }

    @Test
    fun test_with_number(){
        assertEquals(false, checkPalindrome("8987"))
    }
}