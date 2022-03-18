package com.albion.ds.list

import org.junit.Test
import org.junit.Assert.*

class SimpleLinkedListTest {

    @Test
    fun testBasic() {
        val input = intArrayOf(1,2,3,4,5,6,7)
        val list = SimpleLinkedList(input)
        list.printList()
    }

    @Test
    fun testEmpty() {
        val input = intArrayOf()
        val list = SimpleLinkedList(input)
        assertTrue(list.isEmpty)
    }
}