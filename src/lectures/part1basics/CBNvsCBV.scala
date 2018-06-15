package lectures.part1basics

/**
  * Created by Daniel on 07-May-18.
  */
object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + 1257387745764245L)
    println("by value: " + 1257387745764245L)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + System.nanoTime())
    println("by name: " + System.nanoTime())
  }

  calledByValue(1257387745764245L)
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//  printFirst(infinite(), 34)
  printFirst(34, infinite())
}
