
object advance {

    def factorial(n: Int): Int = {

        @annotation.tailrec
        def go(a: Int, b: Int): Int = {
            if (a <= 0) b
            else go(a-1, a*b)
        }

        go(n, 1)

    }

    def abs(num: Int): Int = {
        if(num < 0) -num
        else num
    }

    def result(name: String, n: Int, f: Int => Int): String = {
        val msg = "the %s of %d is %d"
        msg.format(name, n, f(n))
    }

    def main(args: Array[String]): Unit = {
        //println(factorial(12))
        println(result("factorial value", 12, factorial))
        println(result("abs value", -132, abs))
    }

}
