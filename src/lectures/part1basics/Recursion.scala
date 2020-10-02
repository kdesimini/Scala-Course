package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int =
    if(n <= 1) 1
    else {
      println("Computin factorial of " + n + " - I fist need factorial of " + (n-1))
      val result = n * factorial(n - 1)

      result
    }
    println(factorial(10))

//  def anotherF(n: Int): Int = {
//    def factHelper(x: Int, accumulator: Int): Int =
//      if (x <= 1) accumulator
//      else factHelper(x - 1, x * accumulator)
//
////    factHelper(n, 1)
//  }

  // Exercise 1
  @tailrec
  def tailRecStringConcat(n: BigInt, accum: String): String =
    if (n < 1) accum
    else tailRecStringConcat(n - 1, {println(n).toString:String; accum + " " + n; })

  print(tailRecStringConcat(55300, "Begin "))
}
