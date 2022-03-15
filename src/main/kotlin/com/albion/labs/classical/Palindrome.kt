package com.albion.labs.classical

import java.util.*

class Palindrome {
    companion object {
        // https://leetcode.com/problems/valid-palindrome/
        fun validPalindrome(s: String): Boolean {
            val input = s.filter { it.isLetterOrDigit() }
                .lowercase(Locale.getDefault())
            val reverse = input.reversed()
            return reverse == input
        }
    }
}