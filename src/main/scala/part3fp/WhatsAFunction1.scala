package part3fp

object WhatsAFunction extends App{

  //use functions as first class elements
  //work with functions like plain values. its a dream
  //problem : oop

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(20))

  //Scala supports these function types from Function 1 to Function 22
  //Function1[A,B]

  val stringToIntConverter : String => Int = new Function1[String, Int] {
    override def apply(v1: String): Int = v1.toInt
  }

  println(stringToIntConverter("3") + 4)


  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int ] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  //Function types Function2[A,B,R] === (A,B) => R
  //ALL SCALA FUNCTIONS ARE OBJECTS OR INSTANCES OF CLASSES deriving from function 1,2,...22

  /*

   */

  def concatenator: (String,String) => String = new Function2[String,String,String] {
    override def apply(v1: String, v2: String): String = v1 + " " + v2
  }

  println(concatenator("Hello","Scala"))

  //higher order functions either receive or return functions. esp map, flatmap, filter

  //Function1[Int, Function1[Int,Int]]

  val superAdder : Function1[Int, Function1[Int,Int]] = new Function1[Int, Function1[Int,Int]] {
    override def apply(x: Int): Function1[Int,Int] = new Function[Int,Int] {
      override def apply(y: Int): Int = x + y
     }
  }

  /* Can also be written like this:-
    val superAdder : Int => Int => Int = new Function1[Int, Function1[Int,Int]] {
    override def apply(x: Int): Int => Int = new Function[Int,Int] {
      override def apply(y: Int): Int = x + y
     }
  }
   */

  val adder3 = superAdder(3)
  println(adder3(4))
  println(superAdder(3)(4)) //curried function -- receives some parameter and returns another function which receives parameters




}

trait MyFunction[A,B]{
  def apply(element: A) : B
}
