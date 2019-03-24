package part2oop

object OOBasics extends App{

  val person = new Person("John", 26)
  println(person.age)

  person.greet("Daniel")
  person.greet()

}

//Constuctor
class Person(name:String, val age:Int) {
  //body

  //Anything can be done inside the class blocks, and val definitions are fields and can be accessed
  //At the time of instatntiation, all expressions in the code block will be executed.
  val x = 2
  println(1+3)

  //method
  def greet(name: String) : Unit = println(s"${this.name} says : Hi, $name") // Param more priority hence this is used

  //overloading
  def greet() :Unit = println(s"Hi Im $name") // THIS WOULD IMPLY name as this.name


  //Overloading constructors
  def this(name: String) = this(name, 0) // calls the primary constructor with age as 0

  def this() = this ("Johnny Doe") // Calls the secondary constructor.

}
// Age is a class param but not a CLASS MEMBER so cannot be accessed directly. so add val or var to access


