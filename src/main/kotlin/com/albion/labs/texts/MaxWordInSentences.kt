package com.albion.labs.texts

// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
class MaxWordInSentences {
    companion object {
        fun mostWordsFound(sentences: Array<String>): Int {
            var maxCount = 0
            for(sentence in sentences) {
                val count = sentence.split(" ").size
                if(count > maxCount) {
                    maxCount = count
                }
            }
            return maxCount
        }
    }
}