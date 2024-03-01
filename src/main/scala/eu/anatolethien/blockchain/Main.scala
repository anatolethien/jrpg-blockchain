package eu.anatolethien.blockchain

object Main extends App {
  val GENESIS = "Octopath Traveler"

  val t1 = Transaction(6, 3, 10)
  val t2 = Transaction(2, 3, 20)
  val t3 = Transaction(1, 3, 5)

  val b1 = Block(GENESIS, t1)
  println(b1.hash)
  val b2 = Block(b1.hash, t2)
  println(b2.hash)
  val b3 = Block(b2.hash, t3)
  println(b3.hash)
}