package com.albion.labs.classical

import org.junit.Test

import org.junit.Assert.*

class PalindromeTest {
    @Test
    fun testBasic() {
        val input = "A man, a plan, a canal: Panama"
        val expected = true
        val actual = Palindrome.validPalindrome(input)
        assertEquals(expected, actual)
    }
}