package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 //an expression evaluated to a value with type int (inferred)
  println(x)

  //instructions vs expressions

  // side effects are printing to console, whiles, reassigning (expressions returning units)

  //code blocks (special kind of expressions)

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  //1. what is difference between "hello world" vs println("hello world") first is string literal, second is unit
  //2. what is value of:
  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  def aFactorialFunction(n: Int): Int = {
    if(n == 1) n
    else(n * aFactorialFunction(n-1))
  }

  println(aFactorialFunction(6))

  def aGreeting(name: String, age: Int): String = {
    val greeting = "Hello, my name is " + name + " and I am " + age + " years old!"
    greeting
  }

  println(aGreeting("Keith", 23))

}
