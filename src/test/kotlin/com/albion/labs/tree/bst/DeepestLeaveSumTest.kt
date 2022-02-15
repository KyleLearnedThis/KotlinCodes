package com.albion.labs.tree.bst

import com.albion.ds.tree.bst.BinaryTreePrinter
import com.albion.ds.tree.bst.TreeNode
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class DeepestLeaveSumTest {

    @Test
    fun deepestLeavesSum() {
        val root = TreeNode(1)
        val two = TreeNode(2)
        val three = TreeNode(3)
        val four = TreeNode(4)
        val five = TreeNode(5)
        val six = TreeNode(6)
        val seven = TreeNode(7)
        val eight = TreeNode(8)
        root.left = two
        root.right = three
        two.left = four
        two.right = five
        three.right = six
        four.left = seven
        six.right = eight
        BinaryTreePrinter.printNode(root)
        val expected = 15
        val actual = DeepestLeaveSum.deepestLeavesSum(root)
        assertEquals(expected, actual)
    }
}