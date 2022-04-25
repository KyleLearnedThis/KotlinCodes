package com.albion.labs.numbers

class PivotIndex {
    companion object {
        fun find(nums: IntArray): Int {
            for (i in nums.indices) {
                val left = nums.copyOfRange(0, i)
                    .fold(0) { sum, value ->
                        sum + value
                    }
                val right = nums.copyOfRange(i + 1, nums.size)
                    .fold(0) { sum, value ->
                        sum + value
                    }
                if (left == right) {
                    return i
                }
            }
            return -1
        }
    }
}