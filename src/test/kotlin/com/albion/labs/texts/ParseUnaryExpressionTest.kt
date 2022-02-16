package com.albion.labs.texts

import org.junit.Test

import org.junit.Assert.*

class ParseUnaryExpressionTest {

    @Test
    fun testBasic() {
        val input = arrayOf("--X","X++","X++")
        val expected = 1
        val actual = ParseUnaryExpression.finalValueAfterOperations(input)
        assertEquals(expected, actual)
    }
}