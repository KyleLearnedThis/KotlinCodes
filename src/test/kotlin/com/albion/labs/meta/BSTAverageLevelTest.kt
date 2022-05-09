package com.albion.labs.meta

import com.albion.ds.tree.bst.BinaryTreePrinter
import com.albion.labs.tree.bst.HeightBalancedTree
import org.junit.Test

import org.junit.Assert.*

class BSTAverageLevelTest {

    @Test
    fun testBFS01() {
        val input = intArrayOf(1,2,3,4,5,6,7)
        val tree = HeightBalancedTree()
        val root = tree.sortedArrayToBST(input)
        BinaryTreePrinter.printNode(root!!)
        val expected = arrayOf(4.0, 4.0, 4.0)
        val actual = BSTAverageLevel.bfs(root)
        assertTrue(expected contentEquals actual)
    }

    @Test
    fun testDFS01() {
        val input = intArrayOf(1,2,3,4,5,6,7)
        val tree = HeightBalancedTree()
        val root = tree.sortedArrayToBST(input)
        BinaryTreePrinter.printNode(root!!)
        val expected = arrayOf(4.0, 4.0, 4.0)
        val actual = BSTAverageLevel.dfs(root)
        assertTrue(expected contentEquals actual)
    }
}