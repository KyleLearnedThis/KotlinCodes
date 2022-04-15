package com.albion.labs.numbers

// https://www.techiedelight.com/find-subarrays-given-sum-array/
class FindSubArrays {
    companion object {
        fun findSubArrays(nums: IntArray, target: Int): Array<IntArray> {
            var result = mutableListOf<IntArray>()
            for (i in nums.indices) {
                var currentSum = 0
                // consider all subarrays starting from `i` and ending at `j`
                for (j in i until nums.size) {
                    // sum of elements so far
                    currentSum += nums[j]
                    // if the sum so far is equal to the given sum
                    if (currentSum == target) {
                        val sub = nums.copyOfRange(i, j+1)
                        result.add(sub)
                    }
                }
            }
            return result.toTypedArray()
        }
    }
}