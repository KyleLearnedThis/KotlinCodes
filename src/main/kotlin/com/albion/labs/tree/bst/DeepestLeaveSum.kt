package com.albion.labs.tree.bst

import com.albion.ds.tree.bst.TreeNode
import java.util.*

// https://leetcode.com/problems/deepest-leaves-sum/
class DeepestLeaveSum {
    companion object {
        fun deepestLeavesSum(root: TreeNode<Int>?): Int {
            var res = 0
            var i: Int
            val q = LinkedList<TreeNode<Int>>()
            if (root != null) {
                q.add(root)
            } else {
                return 0
            }
            while (!q.isEmpty()) {
                i = q.size - 1
                res = 0
                while (i >= 0) {
                    val node: TreeNode<Int> = q.poll()
                    res += node.data
                    if (node.right != null) {
                        q.add(node?.right!!)
                    }
                    if (node.left != null) {
                        q.add(node?.left!!)
                    }
                    --i
                }
            }
            return res
        }
    }
}