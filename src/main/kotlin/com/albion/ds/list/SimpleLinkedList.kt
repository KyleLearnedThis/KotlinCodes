package com.albion.ds.list

class SimpleLinkedList(input: IntArray = intArrayOf()) : BaseList<Int>() {
    init {
        append(input)
    }
    fun append(n: Int) {
        if (head == null) {
            head = ListNode(n)
        } else {
            var cur = head
            while(cur?.next != null) {
                cur = cur?.next
            }
            cur?.next = ListNode(n)
        }
    }

    fun append(input: IntArray) {
        input.forEach { append(it) }
    }
}