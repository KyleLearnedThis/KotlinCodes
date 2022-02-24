package com.albion.labs.classical

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
                } else if (stack.isEmpty() || stack.removeAt(0) !== c) {
                    return false
                }
            }
            return stack.isEmpty()
        }
    }
}