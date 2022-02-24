package com.albion.labs.classical

// https://leetcode.com/problems/valid-parentheses/
class ValidParentheses {
    companion object {
        fun isValid(s: String): Boolean {
            val stack = mutableListOf<Char>()
            for (c in s.toCharArray()) {
                if (c == '(') {
                    stack.add(')')
                } else if (c == '{') {
                    stack.add('}')
                } else if (c == '[') {
                    stack.add(']')
                } else if (stack.isEmpty() || stack.removeAt(stack.size - 1) !== c) {
                    return false
                }
            }
            return stack.isEmpty()
        }
    }
}