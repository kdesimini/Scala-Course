package lectures.part2oop

object OOBasics extends App {
  val person = new Person("Keith",23)
  println(person.age)

  println(person.valInClass)

  println(person.greet("Daniel"))

  println(person.greet)
}

//this is the constructor These are NOT class members that you can access with '.'
// adding val before the parameter turns it into a member
class Person(name: String, val age: Int) {
  //body (not an expression but instead defines the implementation of class)

  // val and var definition
  val valInClass = 2

  //method
  def greet(name: String): Unit = println(s"${this.name} says hi, $name")

  // 'this.name is implied'
  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //packages and more complex stuff

  //expression
  println(1 + 1)

  // Value of code block is ignored since the body is the definition
}

