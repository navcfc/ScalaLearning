package part1basics

import scala.annotation.tailrec

object Recursion extends App{

  def factorial (n :Int): Int =
    if (n <= 1 ) 1
    else {
      println("Computing factorial of :  " + n + " - I first need fact of " + (n-1))
      val result = n * factorial(n - 1);
      println("Computed factorial of :  " + n + " - I first need fact of " + (n-1))


      result
    }



//  The JVM that  Scala runs on uses a call stack to keep partial results so that it can get back to computing the desrired result
// Each call of the recursive function uses a Stack frame


println(factorial(10))

  //It tries to store all the calls on the Stack. so if its for a 5000 its not going to be pretty
  //Would give a stackoverflow error.. happens when a recursive depth is too big
  //So coding has to be done in a smarter way


  def anotherFactorial(n :Int) :Int =
  {
    def factorialHelper(x : Int, accumulator: Int) : Int =
      if(x <= 1) accumulator
      else factorialHelper(x-1, x* accumulator)

    factorialHelper(n , 1)

  }

  /*
    anotherFactorial(10) = factorialHelper(10,1)
    = factorialHelper(9, 10 * 1)
    = factorialHelper(8, 9 *10 * 1)
    = factorialHelper(7, 8 * 9 * 10 * 1)
    = factorialHelper(6, 7 * 8 * 9 * 10 * 1  )
    ...
    = factorialHelper(1, 1 * 2 * 3 * 4 * .... * 10)
*/


  //For tail recursive, the recursive function should be the last expression of its code path. This allows scala to preserve its stack frame and not use additional stack frames for recursive calls.
  //previous one used separate stack frames for each calls. in second one its replaced
  //This is called TAIL RECURSIVE function @tailrec to see f its tail rec or not
  // Use this for LOOPS


  //Concatenation using tail recursive

    @tailrec
    def concatHelper(str: String, n: Int, accumulator : String): String = {
      if (n <= 0 ) accumulator
      else concatHelper(str, n -1 , accumulator + str )

    }

  println(concatHelper("Hello", 5 , " "))




  //Check daniel's code for prime and fibonacci

  
}
