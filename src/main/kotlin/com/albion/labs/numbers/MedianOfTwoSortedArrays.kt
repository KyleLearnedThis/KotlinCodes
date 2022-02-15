package com.albion.labs.numbers

// https://leetcode.com/problems/median-of-two-sorted-arrays/
class MedianOfTwoSortedArrays {
    companion object {
        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            val m = nums1.size
            val n = nums2.size
            val A = Array(m+n) { 0 }

            var i = m - 1
            var j = n - 1
            var k = m + n - 1

            while (k >= 0) {
                if (j < 0 || i >= 0 && nums1[i] > nums2[j]) {
                    A[k--] = nums1[i--]
                } else {
                    A[k--] = nums2[j--]
                }
            }

            val o = A.size / 2
            return if(A.size % 2 == 0 ){
                (A[o-1] + A[o]).toDouble()/2.0
            } else {
                A[o].toDouble()
            }
        }

        fun findMedianSortedArraysV2(A: IntArray, B: IntArray): Double {
            val m: Int = A.size
            val n: Int = B.size
            val l = (m + n + 1) / 2
            val r = (m + n + 2) / 2
            return (getKth(A, 0, B, 0, l) + getKth(A, 0, B, 0, r)) / 2.0
        }

        private fun getKth(A: IntArray, aStart: Int, B: IntArray, bStart: Int, k: Int): Double {
            if (aStart > A.size - 1) {
                return B[bStart + k - 1].toDouble()
            }
            if (bStart > B.size - 1) {
                return A[aStart + k - 1].toDouble()
            }
            if (k == 1) {
                return A[aStart].coerceAtMost(B[bStart]).toDouble()
            }
            var aMid = Int.MAX_VALUE
            var bMid = Int.MAX_VALUE
            if (aStart + k / 2 - 1 < A.size) {
                aMid = A[aStart + k / 2 - 1]
            }
            if (bStart + k / 2 - 1 < B.size) {
                bMid = B[bStart + k / 2 - 1]
            }
            return if (aMid < bMid)
                getKth(A, aStart + k / 2, B, bStart, k - k / 2) // Check: aRight + bLeft
            else getKth(A, aStart, B, bStart + k / 2, k - k / 2) // Check: bRight + aLeft
        }
    }
}