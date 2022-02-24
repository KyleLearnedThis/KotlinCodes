package com.albion.labs.lang

import org.junit.Test

class InterfacePracticesTest {

    @Test
    fun testFoo() {
        println("==========")
        val c = C()
        c.foo()
        println("==========")
        val d = D()
        d.foo()
        println("==========")
    }

    @Test
    fun testBar() {
        println("==========")
        val c = C()
        c.bar()
        println("==========")
        val d = D()
        d.bar()
        println("==========")
    }

}