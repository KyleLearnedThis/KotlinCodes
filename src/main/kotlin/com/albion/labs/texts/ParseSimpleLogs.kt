package com.albion.labs.texts

import java.io.File

// An interview question
class ParseSimpleLogs(private val filePath: String) {
    fun getLogs(startTime: Long, endTime: Long): Array<String> {
        val inputs = parseFile()
        var result = mutableMapOf<Long,String>()
        for(line in inputs) {
            if(line.contains(">")) {
                val pair = line.split(">")
                val timeStamp = pair[0].toLong()
                val message = pair[1]
                result[timeStamp] = message
            }
        }
        result = result.filter { it.key >= startTime }.toMutableMap()
        result = result.filter { it.key <= endTime }.toMutableMap()
        return result.map { it.value }.toTypedArray()
    }

    private fun parseFile(): List<String> {
        val base = File("./")
        val relativePath = "src/test/kotlin/com/albion/labs/texts/resources/"
        val absoluteDirectoryPath = base.absolutePath + File.separator + relativePath
        return File(absoluteDirectoryPath, filePath).readLines()
    }
}