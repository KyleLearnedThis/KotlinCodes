package com.albion.labs.numbers

import org.junit.Assert
import org.junit.Test

class FindSubArraysTest {
    @Test
    fun testBasic01() {
        val input = intArrayOf(3, 4, -7, 1, 3, 3, 1, -4)
        val target = 7
        val actualResults = FindSubArrays.findSubArrays(input, target)
        for(list in actualResults) {
            for(item in list){
                print("[$item] ")
            }
            println()
        }
        val expectedResults = arrayOf(
            intArrayOf(3, 4),
            intArrayOf(3, 4, -7, 1, 3, 3),
            intArrayOf(1, 3, 3),
            intArrayOf(3, 3, 1)
        )
        Assert.assertTrue(expectedResults.size == actualResults.size)
        for(i in expectedResults.indices) {
            val actual = actualResults[i]
            val expect = expectedResults[i]
            Assert.assertTrue(actual.contentEquals(expect))
        }
    }
}