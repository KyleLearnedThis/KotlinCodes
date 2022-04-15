package com.albion.labs.numbers

import org.junit.Assert.assertTrue
import org.junit.Test

class RevenueMilestonesTest {
    @Test
    fun testBasic01() {
        val revenues = intArrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
        val milestones = intArrayOf(100, 200, 500)
        val expected = intArrayOf(4,6,10)
        val actual = RevenueMilestones.getMilestoneDays(revenues, milestones)
        assertTrue(expected.contentEquals(actual))
    }

    @Test
    fun testBasic02() {
        val revenues = intArrayOf(100, 200, 300, 400, 500)
        val milestones = intArrayOf(300, 800, 1000, 1400)
        val expected = intArrayOf(2, 4, 4, 5)
        val actual = RevenueMilestones.getMilestoneDays(revenues, milestones)
        assertTrue(expected.contentEquals(actual))
    }
}