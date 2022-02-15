package com.albion.labs.tree.bst

import com.albion.ds.tree.bst.BinarySearchTree
import com.albion.ds.tree.bst.BinaryTreePrinter
import com.albion.ds.tree.bst.TreeNode
import org.junit.Assert
import org.junit.Test


internal class TreeLeavesSumTest {

    @Test
    fun testBasic() {
        val input = intArrayOf(1,2,3,4,5)
        var tree = BinarySearchTree<Int>()
        for(i in input) {
            tree.insert(i)
        }
        val root = tree.root!!
        BinaryTreePrinter.printNode(root)
        val expected = 5
        val actual = TreeLeavesSum.leavesSum(root)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testNormal() {
        val input = intArrayOf(3,1,2,5,4)
        var tree = BinarySearchTree<Int>()
        for(i in input) {
            tree.insert(i)
        }
        val root = tree.root!!
        BinaryTreePrinter.printNode(root)
        val expected = 6
        val actual = TreeLeavesSum.leavesSum(root)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testNonBSTTree() {
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
        val expected = 20
        val actual = TreeLeavesSum.leavesSum(root)
        Assert.assertEquals(expected, actual)
    }
}