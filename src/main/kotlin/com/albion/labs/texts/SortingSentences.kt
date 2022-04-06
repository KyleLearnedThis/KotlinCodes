package com.albion.labs.texts

// https://leetcode.com/problems/sorting-the-sentence/
class SortingSentences {
    companion object {
        fun sortSentence(s: String): String {
            var map = mutableMapOf<Int, String>()
            var result = ""
            val cuts = s.split(" ")
            for (cut in cuts) {
                val index = cut.toCharArray()
                    .filter { it.isDigit() }
                    .toCharArray()
                    .joinToString()
                    .toInt()
                val chars = cut.toCharArray()
                    .filter { it.isLetter() }
                    .toCharArray()
                val text = String(chars)
                map[index] = text
            }
            val list = ArrayList(map.entries)
            list.sortWith { a, b -> a.key - b.key }

            for (i in list.indices) {
                val item = list[i]
                val value = item.value
                result += value
                if (i != list.size - 1) {
                    result += " "
                }
            }
            return result
        }
    }
}