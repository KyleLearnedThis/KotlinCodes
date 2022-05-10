package com.albion.labs.meta

import com.albion.ds.tree.bst.TreeNode

// https://leetcode.com/problems/average-of-levels-in-binary-tree/
class BSTAverageLevel {
    companion object {
        fun bfs(root: TreeNode<Int>?): Array<Double> {
            val result = mutableListOf<Double>()
            val queue = mutableListOf<TreeNode<Int>?>()

            if (root == null) {
                return result.toTypedArray()
            }
            queue.add(root)

            while (queue.isNotEmpty()) {
                val size = queue.size.toDouble()
                var sum = 0.0
                for (i in 0 until queue.count()) {
                    val cur = queue.removeFirst()
                    sum += cur!!.data.toDouble()

                    cur.left?.let {
                        queue.add(it)
                    }

                    cur.right?.let {
                        queue.add(it)
                    }
                }
                result.add(sum / size)
            }
            return result.toTypedArray()
        }

        fun dfs(root: TreeNode<Int>?): Array<Double> {
            val result = mutableListOf<Double>()
            val map = mutableMapOf<Int, MutableList<Int>>()
            dfsWork(0, root, map)

            val list = map.toSortedMap()

            for(item in list) {
                val key = item.key
                val value = item.value
                print("[$key]->[$value] ")
                val currentAverage: Double = value.reduce { acc, i -> acc + i }.toDouble() / value.count().toDouble()
                result.add(currentAverage)
            }
            println()
            return result.toTypedArray()
        }

        fun dfsWork(level: Int, node: TreeNode<Int>?, map: MutableMap<Int, MutableList<Int>>) {
            if(node == null) {
                return
            }

            var levelList = map.getOrDefault(level, mutableListOf())
            val data = node!!.data
            levelList.add(data)
            map[level] = levelList

            dfsWork(level+1, node?.left, map)
            dfsWork(level+1, node?.right, map)
        }
    }
}