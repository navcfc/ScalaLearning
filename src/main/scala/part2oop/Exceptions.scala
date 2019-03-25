package part2oop

object Exceptions extends App{

  val x : String = null

  //println(x.length)
//^^ this will crash will nullpointer exception
  //1. throwing and catching exceptions
//  val aWeirdValue = throw new NullPointerException

  //throwable classes ectend the Throwable class
  //Exception and Error are the major Throwable subtypes


  //2. how to catch exceptions
  def getInt(withExceptions:Boolean) :Int =
    if (withExceptions) throw new RuntimeException("No Int for you")
    else 42

  val potentialFail = try {
    //code that might fail
    getInt(true)

  } catch {
    case e: RuntimeException => println("caught a run time exception")

  }
  finally {
    //code that will get executed no matter what
    //optional
    //doesnt influence return type
    //use only for side effects
    println("finally")
  }

  println(potentialFail)


  //3. how to define own exceptions
//  class MyException extends Exception
//  val exception = new MyException
//
//  throw exception


  //Out of memory error : more memory than JVM allocated
  //val array = Array.ofDim(Int.MaxValue)

  //Stack Overflow error
//  def infinite: Int = 1 + infinite
//  val noLimit = infinite


  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalcException extends RuntimeException("Division by 0")

  object PocketCalculator {

    def add(x : Int, y: Int) = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0 ) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0 ) throw new UnderflowException
      else result

    }

    def subtract(x : Int, y: Int) = {
      val result = x - y
      if (x > 0 && y < 0 && result < 0 ) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0 ) throw new UnderflowException
      else result

    }

    def multiply(x : Int, y: Int) = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0 ) throw new OverflowException
      else if (x < 0 && y < 0 && result < 0 ) throw new OverflowException
      else if (x > 0 && y < 0 && result > 0 ) throw new UnderflowException

      else if (x < 0 && y > 0 && result > 0 ) throw new UnderflowException
      else result

    }



    def divide(x : Int, y: Int) = {
      if (y==0) throw new MathCalcException
      else x / y

    }


    println(PocketCalculator.divide(3,1))
  }

}
