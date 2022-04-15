package com.albion.labs.numbers

class RevenueMilestones {
    companion object {
        fun getMilestoneDays(revenues: IntArray, milestones: IntArray): IntArray {
            var result = mutableListOf<Int>()
            for (milestone in milestones) {
                var sum = 0
                for (i in revenues.indices) {
                    val revenue = revenues[i]
                    sum += revenue
                    if (sum >= milestone) {
                        result.add(i + 1)
                        break
                    }
                }
            }
            return result.toIntArray()
        }
    }
}