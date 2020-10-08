package lectures.part1basics

import scala.+:

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println((str.split(" ").toList))
  println(str.startsWith("Hello"))
  println(str.replace(" ", "_"))
  println(str.toUpperCase())
  println(str.toLowerCase())
  println(str.length())

  // scala utitlites (above were java functions)
  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  //string interpolators

  // s-interpolator
  val name = "Keith"
  val age = "23"
  val greeting = s"Hello, my name is $name and I am $age years old." //only works if you prepend s (s interpolated strings)
  val anotherGreeting = s"Hello, my name is $name and I will turn ${age.toInt + 1} next year."
  println(greeting)
  println(anotherGreeting)

  // F-interpolators can also receive printf formats
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"  //two characters min, two decimals
  println(myth)


  // Raw-interpolator
  println(raw"This is a \n newline")


}
