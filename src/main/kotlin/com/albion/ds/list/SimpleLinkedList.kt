package com.albion.ds.list

class SimpleLinkedList(input: IntArray = intArrayOf()) : BaseList<Int>() {
    init {
        append(input)
    }
    fun append(n: Int) {
        if (head == null) {
            head = ListNode(n)
            val last = last()
            last?.next = ListNode(n)
        }
    }

    fun last(): ListNode<Int>? {
        var cur = head
        while(cur?.next != null) {
            cur = cur?.next
        }
        return cur
    }

    fun append(input: IntArray) {
        input.forEach { append(it) }
    }
}