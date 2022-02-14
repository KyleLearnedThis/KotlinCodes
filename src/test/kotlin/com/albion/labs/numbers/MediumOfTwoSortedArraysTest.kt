package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test


internal class MediumOfTwoSortedArraysTest {
    @Test
    fun findMedianSortedArrays() {
        val a = intArrayOf(1,2)
        val b = intArrayOf(3,4)
        val actual = MediumOfTwoSortedArrays.findMedianSortedArrays(a,b)
        val expected = 2.5
        Assert.assertEquals(expected, actual, 0.000001)
    }
}