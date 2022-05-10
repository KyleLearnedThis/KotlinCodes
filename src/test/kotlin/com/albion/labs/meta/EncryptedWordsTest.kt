package com.albion.labs.meta

import org.junit.Assert
import org.junit.Test

class EncryptedWordsTest {
    @Test
    fun testBasic01() {
        val input = "abc"
        val expected = "bac"
        val actual = EncryptedWords.findEncryptedWord(input)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testBasic02() {
        val input = "facebook"
        val expected = "eafcobok"
        val actual = EncryptedWords.findEncryptedWord(input)
        Assert.assertEquals(expected, actual)
    }
}