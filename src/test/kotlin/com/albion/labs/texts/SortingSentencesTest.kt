package com.albion.labs.texts

import org.junit.Assert.assertEquals
import org.junit.Test

class SortingSentencesTest {

    @Test
    fun testBasic01() {
        val input = "is2 sentence4 This1 a3"
        val expected = "This is a sentence"
        val actual = SortingSentences.sortSentence(input)
        assertEquals(expected, actual)
    }

    @Test
    fun testBasic02() {
        val input = "Myself2 Me1 I4 and3"
        val expected = "Me Myself and I"
        val actual = SortingSentences.sortSentence(input)
        assertEquals(expected, actual)
    }
}