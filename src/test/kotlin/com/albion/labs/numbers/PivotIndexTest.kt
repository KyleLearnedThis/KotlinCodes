package com.albion.labs.numbers

import org.junit.Assert.assertEquals
import org.junit.Test

class PivotIndexTest {

    @Test
    fun testBasic01() {
        val input = intArrayOf(1,7,3,6,5,6)
        val expected = 3
        val actual = PivotIndex.find(input)
        assertEquals(expected, actual)
    }

    @Test
    fun testBasic02() {
        val input = intArrayOf(1,2,3)
        val expected = -1
        val actual = PivotIndex.find(input)
        assertEquals(expected, actual)
    }

    @Test
    fun testBasic03() {
        val input = intArrayOf(2,1,-1)
        val expected = 0
        val actual = PivotIndex.find(input)
        assertEquals(expected, actual)
    }
}