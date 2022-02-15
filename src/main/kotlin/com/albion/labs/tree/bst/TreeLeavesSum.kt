package com.albion.labs.tree.bst

import com.albion.ds.tree.bst.TreeNode



class TreeLeavesSum {
    companion object {
        var sum = 0
        fun leavesSum(root: TreeNode<Int>?): Int {
            if (root != null) {
                traversal(root)
            }
            return sum
        }
        private fun traversal(root: TreeNode<Int>?) {
            if (root != null) {
                traversal(root.left)
                if (root.left == null && root.right == null) {
                    sum += root.data
                }
                traversal(root.right)
            }
        }
    }
}