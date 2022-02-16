package com.albion.labs.texts

import org.junit.Test

import org.junit.Assert.*

class MaxWordInSentencesTest {

    @Test
    fun testBasic() {
        val input = arrayOf("alice and bob love leetcode", "i think so too", "this is great thanks very much")
        val expected = 6
        val actual = MaxWordInSentences.mostWordsFound(input)
        assertEquals(expected,actual)
    }
}