package com.albion.labs.meta

// https://leetcode.ca/2021-04-14-1762-Buildings-With-an-Ocean-View/
class OceanViewBuildings {
    companion object {
        fun findVisible(input: IntArray): IntArray {
            val result = mutableListOf<Int>()
            var currentMax = Int.MIN_VALUE
            for((index, value) in input.reversed().withIndex()) {
                if(currentMax < value) {
                    val idx = input.size - 1 - index
                    result.add(0, idx)
                    currentMax = value
                }
            }
            return result.toIntArray()
        }
    }
}