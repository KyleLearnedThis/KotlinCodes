package com.albion.labs.meta

import org.junit.Assert.assertTrue
import org.junit.Test

class OceanViewBuildingsTest {

    @Test
    fun testBasic01() {
        val input = intArrayOf(4,2,3,1)
        val expected = intArrayOf(0,2,3)
        val actual = OceanViewBuildings.findVisible(input)
        assertTrue(expected contentEquals actual)
    }

    @Test
    fun testBasic02() {
        val input = intArrayOf(2,2,2,2)
        val expected = intArrayOf(3)
        val actual = OceanViewBuildings.findVisible(input)
        assertTrue(expected contentEquals actual)
    }

    @Test
    fun testBasic03() {
        val input = intArrayOf(1,3,2,4)
        val expected = intArrayOf(3)
        val actual = OceanViewBuildings.findVisible(input)
        assertTrue(expected contentEquals actual)
    }
}