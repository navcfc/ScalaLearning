package part1basics

object Expressions  extends App{

  val x = 1+2 //EXPRESSION

  println(x)

  println(2 + 3 * 4) //math operations- DMAS
  // >>> Right shift with zero extension - rarely used

  println(1 == x) // evaluates to boolean

  // == != > >=  < <=

  println(!(1==x)) //Negation

  var aVar = 2
  aVar += 3  // ..... Side effects
  println(aVar)


  //Instructions(DO - Print, SHow, send to server) vs Expressions(Has a value or type)

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 //Gives back a value , hence if expression
  print(aConditionedValue)



  var i = 0
  while(i < 10) {
    println(i)
    i = i + 1
  }
  //NEVER WRITE THE ABOVE WHILE
  //Its specific to imperative programming like Java, C or Python
  //Scala forces everything to be an expression

  val aWeirdValue = (aVar = 3) //Unit === void in other languages
  println(aWeirdValue)

  //Side effects are the expressions which return Unit. eg : println, whiles, reassigning.

  //Code blocks
  val aCodeBlock  = {
    val y = 2
    val z = y+ 1
    if(z >2) "hello" else "goodbye"
  }
  //Code block is an expression, value is the value of the last expression








}
