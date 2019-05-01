package part3fp

object Options extends  App{

  //Option is a wrapper for a value that might be present o r not
  //map uses option when map.get is used instead of the apply method.

  val myFirstOption : Option[Int] = Some(4)
  val noOption : Option[Int] = None

  println(myFirstOption)

  //unsafe API's
  def unsafeMethod():String = null

  // val result = Some(unsafeMethod()) //WRONG coz Some should always have a value inside

  val result = Option(unsafeMethod()) // Some or none depending on the value

  println(result)
  //Option type does the null checks for us.

  //chained methods
  def backupMethod():String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  //DESIGN unsnafe APIs
  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod() : Option[String] = Some("A valid result")

  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()

  //Functions on options

  println(myFirstOption.isEmpty)
  println(myFirstOption.get) //UNSAFE -- DO NOT USE THIS.. As it can get nulls

  //map,flatMap,filter

  println(myFirstOption.map(_ * 2))
  println(myFirstOption.filter(x => x > 10))
  println(myFirstOption.flatMap(x => Option(x * 10 )))


  //for comprehensions



}
