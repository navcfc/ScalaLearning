package part3fp

import scala.util.Random

object Sequences extends App{

  //Seq -- Have a well defined order, And can be indexed

  val aSequence = Seq(1,2,3,4)
  println(aSequence)

  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(5,6,7)) //Concattenation
  println(aSequence.sorted)

  //Ranges - also seq

  val aRange : Seq[Int] = 1 to 10
  aRange.foreach(println)

  (1 to 10).foreach(x =>println("Hello"))

  //List - Linear sequence - immutable linked list
  val aList = List(1,2,3)
  val prepend = 42 :: aList//(+: - prepend, :+ append)
  println(prepend)

  val apples5 = List.fill(5)("apple") //curriend func
  println(apples5)

  println(aList.mkString("-|-"))


  //Arrays- simple java arrays, Predefined lenghts, can be mutated in place, indexing is fast
  val numbers = Array(1,2,3,4)
  val treeElements = Array.ofDim[Int](3) //allocates space without giving numbers
//println(treeElements)

  treeElements.foreach(println)

  //mutation
  numbers(2)= 0 //sytax sugar for numbers.update(2,0)
  println(numbers.mkString(" "))

  //arrays and sequences
  val numbersSeq: Seq[Int] = numbers //Implicit conversions
  println(numbersSeq) //WrappedArray


  //VECTORS - default implemetnation for immutable seq
  //constant indexed read and write, fast additin of elements, good performance for very large sizes
  val vector:Vector[Int] = Vector(1,2,3)

  println(vector)

  //vectors vs lists

  val maxRuns = 1000
  val maxCapacity = 1000000
  def getWriteTime(collection : Seq[Int] ) : Double = {
    val r = new Random

    val times = for {
      it <- 1 to maxRuns

    } yield {
      val currentTime = System.nanoTime()
      //operation
      collection.updated(r.nextInt(maxCapacity),r.nextInt())
      System.nanoTime() - currentTime
    }

    times.sum * 1.0 / maxRuns
  }


  val numbersList  = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector

  //KEEPS REFERENCE TO TAILS, UDPATING IN MIDDLE IS VERY LONG TIME.update it in head, its very fast/ but in middle not very efficient
  println(getWriteTime(numbersList))

  //DEPTH OF TREE IS SMALL.
  ////NDEED TO UPDATE ENTIRE 32 ELEMENT CHUNK
  println(getWriteTime(numbersVector))



}
