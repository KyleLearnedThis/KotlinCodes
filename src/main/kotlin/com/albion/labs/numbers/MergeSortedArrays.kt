package com.albion.labs.numbers

// https://www.geeksforgeeks.org/merge-two-sorted-arrays/
class MergeSortedArrays {
    companion object {
        fun merge(a: IntArray, b: IntArray): IntArray? {
            val result = IntArray(a.size + b.size)
            var i = 0
            var j = 0
            var k = 0
            while (i < a.size && j < b.size) {
                result[k] = if (a[i] < b[j]){
                    a[i++]
                } else {
                    b[j++]
                }
                k++
            }
            while (i < a.size) {
                result[k] = a[i]
                k++
                i++
            }

            while (j < b.size) {
                result[k] = b[j]
                k++
                j++
            }
            return result
        }
    }
}