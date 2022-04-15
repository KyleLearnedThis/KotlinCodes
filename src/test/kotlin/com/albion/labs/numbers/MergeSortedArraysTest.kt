package com.albion.labs.numbers

import org.junit.Test

import org.junit.Assert.*

class MergeSortedArraysTest {

    @Test
    fun testBasic01() {
        val a = intArrayOf(1,3,5,7,9)
        val b = intArrayOf(2,4,6,8,10)
        val expected = intArrayOf(1,2,3,4,5,6,7,8,9,10)
        val actual = MergeSortedArrays.merge(a,b)
        assertTrue(expected.contentEquals(actual))
    }
}