package part1basics

object CBNvCBV extends App{

  def calledByValue(x :Long) : Unit = {
    println("by value " + x)
    println("by value " + x)
  }

  def calledByName(x : => Long):Unit = {
    println("by name " + x)
    println("by name " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  /*
  Output:
  by value 161126203832599
by value 161126203832599
by name 161126458801978
by name 161126458881054

As we can see by name its different. At the time of call by value, the exact value of the expression is computed and the same value is used in function definition.
in by name : the expression is passed as is and its evaluated everytime in the entire function.

=> it delays the evaluation of the expression passed as a parameter and is used everytime in the function definition
Useful in lazy streams. ill study during try types

   */


  def infinite() : Int = 1 + infinite()

  def printFirst(x:Int, z:Int, y: => Int) = println(x)

//  printFirst(1, infinite(), 34) //Crashes

  printFirst(1, 34, infinite()) // DOesnt crash .. BECAUSE the =>  DELAYs the evaluation of expression until ITS USED
}
