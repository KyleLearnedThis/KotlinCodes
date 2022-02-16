package com.albion.labs.texts

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
class ParseUnaryExpression {
    companion object {
        fun finalValueAfterOperations(operations: Array<String>): Int {
            var result = 0
            for (operation in operations) {
                if (operation.contains("+")) {
                    result += 1
                } else if (operation.contains("-")) {
                    result -= 1
                }
            }
            return result
        }
    }
}