package com.albion.labs.lang

import org.junit.Test

class MapPracticeTest {

    @Test
    fun testMakeFrequencyMap() {
        val m = MapPractice()
        val map = m.makeFrequencyMap(arrayOf(1,1,1,1,1,2,2,2,2,3,3,3,4,4,5))
        m.printMap(map)
    }

    @Test
    fun testSortByValue() {
        val m = MapPractice()
        var map = m.makeFrequencyMap(arrayOf(5,1,1,1,1,1,2,2,2,2,3,3,3,4,4))
        map = m.sortMapByValue(map)
        m.printMap(map)
    }

    @Test
    fun testSortByKey() {
        val m = MapPractice()
        var map = m.makeFrequencyMap(arrayOf(5,1,1,1,1,1,2,2,2,2,3,3,3,4,4))
        map = m.sortMapByKey(map)
        m.printMap(map)
    }

    @Test
    fun testContent() {
        val m = MapPractice()
        var map = m.makeFrequencyMap(arrayOf(5,1,1,1,1,1,2,2,2,2,3,3,3,4,4))
        val keys = map.keys.sorted()
        for (key in keys) {
           println("===== key: $key =====")
        }
    }

    @Test
    fun testSortedMap() {
        val keys = intArrayOf(8,7,6,5,4,3,2,1)
        val values = intArrayOf(0,1,2,3,4,5,6,7)
        val m = MapPractice()

        val result = m.sortMapByKeyV2(keys, values)
        println("===== AFTER =====")
        for((k,v) in result) {
            println("===== [key: $k] [value: $v] =====")
        }
    }
}