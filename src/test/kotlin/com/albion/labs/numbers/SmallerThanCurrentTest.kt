package com.albion.labs.numbers

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class SmallerThanCurrentTest {

    @Test
    fun testBasic01() {
        val input = intArrayOf(8,1,2,2,3)
        val expected = intArrayOf(4,0,1,1,3)
        val actual = SmallerThanCurrent.smallerNumbersThanCurrent(input)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testBasic02() {
        val input = intArrayOf(7,7,7,7)
        val expected = intArrayOf(0,0,0,0)
        val actual = SmallerThanCurrent.smallerNumbersThanCurrent(input)
        assertArrayEquals(expected, actual)
    }
}