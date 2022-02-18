package com.albion.labs.texts

import org.junit.Test
import org.junit.Assert.*

class ParseSimpleLogsTest {
    @Test
    fun testBasic() {
        val psl = ParseSimpleLogs("simplelog.txt")
        val actual = psl.getLogs(123143124, 123143129)
        val expected = arrayOf(
            "Gochujang Mumblecore",
            "Locavore Plaid",
            "Keffiyeh Mixtape"
        )
        assertArrayEquals(expected, actual)
    }
}