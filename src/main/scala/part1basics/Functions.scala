package part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b //String concatenation

  }

  println(aFunction("hello", 3))

  def aParameterLessFunction() : Int  = 42


  println(aParameterLessFunction())
  println(aParameterLessFunction) // Parameter less can be called without func


  def aRepeatedFunction(aString : String, n : Int) : String = {

    if(n == 1) aString

    else aString + aRepeatedFunction(aString, n-1)
  }

  //Use recursive functions INSTEAD OF LOOPS. FUNDAMENTAL IDEA OF FUNCTIONAL PROGRAMMING
  println(aRepeatedFunction("hello", 4))

  //Compiler can also infer the return type of Functions, So no need to specify thhe return type of function
  //But deleting from recursive function, compiler will COMPLAIN


  def aFunctionWithSideEffects(aString : String) : Unit = println(aString)
  //We need functions with side effects for writing to file, printing on console,etc


  //Code blocks allows us to define auxillary functions
  def aBigFunction(n:Int) :Int = {

    def aSmallerFunction(a:Int, b:Int):Int = a + b

    aSmallerFunction(n,n-1)
  }


  //Assignments

  def aGreetingFunc(name : String, age: Int) : String =
  {
    "Hi my name is " + name + ", Age is " + age
  }

  println(aGreetingFunc("David", 12))



  def aFactorialFunc(n : Int) : Int =
    if( n == 1 ) n
    else n * aFactorialFunc(n-1)


  println(aFactorialFunc(4))



  def aFibonacci(n : Int) : Int =
    if (n <= 2 ) 1
    else aFibonacci(n - 1 ) + aFibonacci( n - 2 )


  println(aFibonacci(8))

 // Prime needs uxillary function
  def aPrime(n : Int) : Boolean = {

    def isPrimUnti(t : Int) : Boolean =
      if (t<= 1) true
      else n%2 != 0 && isPrimUnti(t - 1)

      isPrimUnti(n/2)

  }

  println(aPrime(37))
  println(aPrime(2003))
  println(aPrime(37 * 17))


}

