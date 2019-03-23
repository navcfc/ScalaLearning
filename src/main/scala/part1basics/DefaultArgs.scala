package part1basics

object DefaultArgs extends App{

  //Default argument as 1
  def trFact(n : Int, accumulator: Int = 1) : Int =
    if (n <=1 ) accumulator
    else trFact(n-1, n* accumulator)

  val fact5 = trFact(5)

  def savePicture(format: String = "jpg", width: Int, height : Int) : Unit = println("saving picture")

  //default vals are useful when function is called with same param many many times

  //Copiler is  confused if its leading parameter..
  //savePicture( 800, 600)

  /*
   SOln: 1. Pass in every leading argument
        2. Name the arguments

   */

  savePicture(width = 800, height =  900)




}
