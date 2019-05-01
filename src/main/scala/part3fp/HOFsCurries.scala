package part3fp

object HOFsCurries extends App{

  val superFunction : (Int , (String, (Int => Boolean)) => Int) => (Int => Int) = null
  //HOF
  //map, flatMap, filter

  //function that applies a function n times over a given value x
  // nTimes(f, n, x)
  //nTimes(f, 3, x) = f(f(f(x))) = nTimes(f, 2, f(x))
  //nTimes (f, n, x) = nTimes (f, n-1 , f(x))


  def nTimes (f: Int => Int, n: Int, x: Int) : Int =
    if(n <= 0 ) x
    else nTimes (f, n-1, f(x))

  val plusOne = (x: Int) => x+1
  println(nTimes(plusOne, 10, 1))


  //nTimesBtetter(f,n) = x =>  f(f(f(...(x)))
  //increment10 = ntb(plusOne, 10 ) = x => plusOne ( plusOOne (...(x))
  //val y = increment10(1)
  def nTimesBetter (f: Int => Int, n:Int ) : (Int => Int) =
    if(n <= 0) (x:Int) => x
    else (x:Int) => nTimesBetter(f, n-1) (f(x))

  val plus10 = nTimesBetter(plusOne, 1)
  println(plus10(-2))
  println(plus10(1))


  //curried functions

  val superAdder : Int => (Int => Int ) = (x:Int) => (y: Int) => x + y

  val add3 = superAdder(3) // y => 3 + y
  println(add3(10))

  //functions with multiple parammeter lists
  def curriedFormatter(c : String)(x: Double ) : String  = c.format(x)

  val standardFormat : (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat : (Double => String) = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))



}