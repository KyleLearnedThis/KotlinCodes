package com.albion.labs.lang

interface A {
    fun foo() { println("===== A =====") }
    fun bar()
}

interface B {
    fun foo() { println("~~~~~ B ~~~~~~") }
    fun bar() { println("~~~~~ B Bar ~~~~~") }
}

class C : A {
    override fun bar() { println("##### C bar #####") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}