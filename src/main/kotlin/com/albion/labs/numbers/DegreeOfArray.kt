package com.albion.labs.numbers

import java.util.ArrayList

// https://leetcode.com/problems/degree-of-an-array/
class DegreeOfArray {
    companion object {
        fun findShortestSubArray(nums: IntArray): Int {
            val freq = makeFrequencyMap(nums)
            val list = ArrayList<Map.Entry<Int, Int>>(freq.entries)
            list.sortWith { o1, o2 -> o2.value - o1.value }
            val entry = list[0]
            val value = entry.value
            val topDegreeList = list.filter{ it.value == value }
            var min = Integer.MAX_VALUE
            for(item in topDegreeList) {
                val cur = minArraySize(nums, item.key)
                if(min > cur) {
                    min = cur
                }
            }
            return min
        }
        private fun makeFrequencyMap(n: IntArray): MutableMap<Int, Int> =
            n.toList().groupingBy { it }.eachCount().toMutableMap()

        private fun minArraySize(nums: IntArray, degree: Int): Int {
            val l = nums.indexOfFirst { it == degree }
            val r = nums.indexOfLast { it == degree }
            return r - l + 1
        }
    }
}