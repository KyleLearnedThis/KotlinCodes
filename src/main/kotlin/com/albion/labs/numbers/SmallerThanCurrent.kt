package com.albion.labs.numbers

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class SmallerThanCurrent {
    companion object {
        fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
            val result = mutableListOf<Int>()
            for(i in nums.indices) {
                val value = nums[i]
                val cur = nums.clone().toMutableList()
                cur.removeAt(i)
                val count = cur.filter{it < value}.size
                result.add(count)
            }
            return result.toIntArray()
        }
    }
}