package lectures.part1basics

object DefaultArgs extends App {

  // tail rec factorial
  def trFacta(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFacta(n - 1, n * acc)
  }

  val fact10 = trFacta(6)
  print(fact10)
}
