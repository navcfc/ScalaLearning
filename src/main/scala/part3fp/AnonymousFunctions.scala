package part3fp

object AnonymousFunctions extends App{

  //INstantianitng a fucntion is still very much tied to object oriented way
  val doubler = new Function1[Int, Int] {
    override def apply(x: Int): Int = x * 2
  }

  //SAME AS NEXT ONE
  //anonymous function(LAMBDA) -- Syntactivc sugar for the above
  val doubler1 : Int => Int = x => x * 2
  //OR
  val doubler2  = (x:Int) => x * 2

  //multiple params in a lambda
  val adder: (Int,Int) => Int =  (a:Int, b:Int) => a + b

  //no params
  val justDoSomething: () => Int = () => 3

  //careful
  println(justDoSomething) //fucntion itself
  println(justDoSomething()) //call


  //curly braces with lambdas
  val stringToInt = { (str: String) =>

    str.toInt
  }

  //more syntactic sugar
  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1

  val niceAdder: (Int,Int) => Int = _ + _ /// equivalent to (a,b) => a + b


  //Exercises

  //rewite special adder as anonyoous function

  val superAdd = (x : Int) => (y:Int) => x + y

  println(superAdd(3)(4))

}

