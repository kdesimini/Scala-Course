package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  // vals are immutable

  // types are not required. compiler can infer
  val aString: String = "Hello this is a string";

  //basic types in scala
  val aBoolean: Boolean = true
  val aCharacter: Char = 'a'
  val aShort: Short = 4613
  val aLong: Long = 333728939377284L
  val aFloat: Float = 2.043F
  val aDouble: Double = 3.32

  // variables

  var aVariable: Int = 4
  //can be reassigned
  aVariable = 13
  // side effects let us see what program is doing.
}
