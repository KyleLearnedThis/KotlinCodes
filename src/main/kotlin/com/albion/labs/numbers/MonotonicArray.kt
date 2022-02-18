package com.albion.labs.numbers

class MonotonicArray {
    fun isMonotonic(A: IntArray): Boolean {
        val b = A.clone().sortedArray()
        val c = A.clone().sortedArrayDescending()
        return A.contentEquals(b) || A.contentEquals(c)
    }
}