package com.albion.ds.stack

class Queue<T> {
    private var queue = ArrayList<T>()

    fun enqueue(n: T) {
        queue.add(n)
    }

    fun dequeue(): T {
        if(queue.isNotEmpty()) {
            val n = queue.first()
            queue.removeAt(0)
            return n
        } else {
            throw RuntimeException("Empty queue")
        }
    }
    var size: Int = queue.size
    var isEmpty: Boolean = queue.size == 0

}