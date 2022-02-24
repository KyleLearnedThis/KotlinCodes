package com.albion.labs.classical

import org.junit.Test

import org.junit.Assert.*

class ValidParenthesesTest {

    @Test
    fun testBasic() {
        testWork("()", true)
    }

    @Test
    fun testBasicV02() {
        testWork("[[[[]", false)
    }

    @Test
    fun testBasicV03() {
        testWork("[()[]{}]", false)
    }

    private fun testWork(input: String, expected: Boolean) {
        val actual = ValidParentheses.isValid(input)
        assertEquals(expected, actual)
    }
}