package canessa

object CountingLetters extends App {

  val word: String = "a a a b b c c c dd ffff a a"

  val output = word.toList.distinct.filter(_ != ' ').map( x => (x, word.count(_ == x))).sortWith(_._2 > _._2)

  println(output)
  println(output.lift(0))
  println(output.lift(1))
  println(output.lift(2))

}
