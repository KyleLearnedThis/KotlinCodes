package com.albion.labs.meta

// https://www.johncanessa.com/2020/12/05/encrypted-words/
class EncryptedWords {
    companion object {
        fun findEncryptedWord(s: String): String {
            if(s.length <= 1) {
                return s
            }
            var result = ""
            val input = s.toCharArray()
            var mid = input.size / 2
            if(input.size % 2 == 0) {
                mid--
            }
            val center = input[mid].toString()
            result += center

            if(mid > 0) {
                val leftSide = String(input.copyOfRange(0, mid))
                result += findEncryptedWord(leftSide)
            }

            if(mid < input.size - 1) {
                val rightSide = String(input.copyOfRange(mid+1, input.size))
                result += findEncryptedWord(rightSide)
            }
            return result
        }
    }
}