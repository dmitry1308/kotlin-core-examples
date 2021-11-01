package ru.shepin

fun main() {

    run {
        println("Hello world!")

        var x = 3
        println()

        println("x = $x")

        x = 4

        println()
        for (i in 1..x) {
            println("i = $i")
        }

        var a = 10
        while (a > 1) {
            a = a - 1
            println(if (a < 3) "small a " else "big a ")
        }

        //двоичное число
        val c = 0b1000
        println("c = $c")

        //шестнадцатеричное число
        val f = 0xABC
        println("f = $f")

        //явное указание типа переменной:
        var n:Byte=6
        println("n = $n")
    }

    val x: Long = 2L+


}