package part1basics

object ValuesVariablesTypes extends App {

  val x : Int = 42
  println(x)

  //VALS ARE IMMUTABLE So x = 2 will not work . Similar to finals in java. But used as intermediate computations.
  //Types of VALS Are optional. Compiler can infer the type based on the value. No need to specify Int

  val a : String = "Hello"; val b = "Goodbye " //Not recommended //Unnecessary semicolon

  val aLong : Long = 121421423423432L

  val aFloat : Float = 2131213.0f
  val aDouble : Double = 121.12

  //variables in scala

  var aVariable: Int = 4

  aVariable = 5 //Side effects, can see what a program is doing

  //Variable can be assigned.




}
