
object MyModule {

    sealed trait List[+A]

    case object Nil extends List[Nothing]

    case class Cons[+A](head: A, tail: List[A]) extends List[A]

    def sum(ints: List[Int]): Int = ints match {
        case Nil => 0
        case Cons(x, xs) => x + sum(xs)
    }

    def main(args: Array[String]): Unit = {
        var names = List(3, 5, 8)
        var ls = Cons(2, Cons(3, Cons(8, Nil)))
        //println(names)
        println(sum(ls))
        //println(ls)
    }
}
