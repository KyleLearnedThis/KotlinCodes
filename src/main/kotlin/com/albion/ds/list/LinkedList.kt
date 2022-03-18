package com.albion.ds.list

class LinkedList<T>(input: Array<T>): BaseList<T>() {
    var tail: ListNode<T>? = null

    init {
        for(i in input){
            append(i)
        }
    }

    fun append(n: T) {
        if (head == null) {
            head = ListNode(n)
            tail = head
        } else {
            val cur = ListNode(n)
            tail?.next = cur
            cur.prev = tail
            tail = cur
        }
    }

    fun printListReverse() {
        var cur = tail
        while (cur != null) {
            val data = cur.data
            print("[$data] ")
            cur = cur.prev
        }
        println("")
    }

    fun size(): Int {
        var size = 0
        var cur = head
        while(cur != null) {
            size++
            cur = cur.next
        }
        return size
    }
}