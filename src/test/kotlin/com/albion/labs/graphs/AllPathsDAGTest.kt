package com.albion.labs.graphs

import org.junit.Test
import org.junit.Assert.*

class AllPathsDAGTest {

    @Test
    fun testBasic() {
        val graph = arrayOf(
            intArrayOf(1,2),
            intArrayOf(3),
            intArrayOf(3),
            intArrayOf()
        )
        val actual = AllPathsDAG.allPathsSourceTarget(graph)
        assertTrue(actual.size == 2)
        assertEquals(actual[0],mutableListOf(0,1,3))
        assertEquals(actual[1], mutableListOf(0,2,3))
    }
}