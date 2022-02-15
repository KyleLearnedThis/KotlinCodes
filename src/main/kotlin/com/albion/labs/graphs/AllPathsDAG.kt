package com.albion.labs.graphs

// https://leetcode.com/problems/all-paths-from-source-to-target/
class AllPathsDAG {
    companion object {
        fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
            val res = mutableListOf<List<Int>>()
            val path = mutableListOf<Int>()
            path.add(0)
            dfsSearch(graph, 0, res, path)
            return res
        }

        private fun dfsSearch(graph: Array<IntArray>, node: Int, res: MutableList<List<Int>>, path: MutableList<Int>) {
            if (node == graph.size - 1) {
                res.add(ArrayList(path))
                return
            }
            for (nextNode in graph[node]) {
                path.add(nextNode)
                dfsSearch(graph, nextNode, res, path)
                path.removeAt(path.size - 1)
            }
        }
    }
}