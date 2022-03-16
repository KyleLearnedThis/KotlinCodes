package com.albion.labs.numbers

import org.junit.Test

import org.junit.Assert.*

class DegreeOfArrayTest {

    @Test
    fun testBasic() {
        val input = intArrayOf(1,2,2,3,1,4,2)
        val expected = 6
        val actual = DegreeOfArray.findShortestSubArray(input)
        assertEquals(expected, actual)
    }
    @Test
    fun testBasicV2() {
        val input = intArrayOf(1,2,2,3,1)
        val expected = 2
        val actual = DegreeOfArray.findShortestSubArray(input)
        assertEquals(expected, actual)
    }
}