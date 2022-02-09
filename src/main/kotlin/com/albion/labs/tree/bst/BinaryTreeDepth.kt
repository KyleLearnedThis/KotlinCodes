package com.albion.labs.tree.bst

import com.albion.ds.tree.bst.TreeNode
import kotlin.math.max

class BinaryTreeDepth {
    fun minDepth(root: TreeNode<Int>?): Int {
        if (root == null) {
            return 0
        }
        val left = root.left
        val right = root.right
        val l = minDepth(left)
        val r = minDepth(right)

        return if(l == 0 || r == 0) {
            l + r + 1
        } else {
            Math.min(l,r) + 1
        }
    }

    fun maxDepth(root: TreeNode<Int>?): Int {
        if (root == null) {
            return 0
        }
        val left = root.left
        val right = root.right
        return max(maxDepth(left), maxDepth(right)) + 1
    }

    fun maxDepthV2(root: TreeNode<Int>?): Int {
        return if (root == null) {
            0
        } else {
            1 + max(maxDepth(root.left), maxDepth(root.right))
        }
    }
}