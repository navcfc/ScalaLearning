package part1basics

object StringOps extends App{

  val str: String = "Hello, Iam learning Scala"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)


  val aNumberString  = "45"
  val aNumb = aNumberString.toInt

  //Prepending and appending
  println('a' +: aNumberString :+ 'z')

  println(str.reverse)

  println(str.take(2))

  //Scala specific : String interpolators

  //S -interpolators

  val name = "David"
  val age = 12
  val greeting = s"Hello , my name is $name and age is $age"
//These can evaluate complex expressions

  val aGreating = s"Hello , my name is $name and age is ($age + 1)"

  println(greeting)

  println(aGreating)

  //F - Interpolators

  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per min"

  println(myth)

  //raw interpolator
  println(raw"this is a \n newline")

  val escaped = "This is a \n new line"
  println(raw"$escaped") // IT WILL BE ESCAPED HERE




}
