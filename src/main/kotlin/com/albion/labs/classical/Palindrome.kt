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

        fun validPalindromeV2(s: String): Boolean {
            val arr = s.filter{it.isLetterOrDigit()}
                .lowercase()
                .toCharArray()
            val size = arr.size
            for(i in 0 .. arr.size / 2) {
                val l = arr[i]
                val r = arr[size - i - 1]
                if(l != r) {
                    return false
                }
            }
            return true
        }
    }
}