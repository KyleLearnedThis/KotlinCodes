package com.albion.ds.list

abstract class BaseList<T> {
    var head: ListNode<T>? = null
    fun printList() {
        var cur = head
        while (cur != null) {
            val data = cur.data
            print("[$data] ")
            cur = cur.next
        }
        println("")
    }
    var isEmpty = this.head == null
}