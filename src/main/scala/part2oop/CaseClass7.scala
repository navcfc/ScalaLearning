package part2oop

object CaseClass7 extends App{

  //Case class is used to define a class, object and many methods like toString, hash in ONE GO
  //Lightweight data holding classes with really minimal hassle

  case class Person(name: String, age: Int)

  //1.. class parameters are promoted to fields

  val him = new Person("him", 34)
  println(him.name)

  //2. sensible to string method
  //println(instance) = println(instance.toString) -- SYntactic sugar
  println(him.toString)


  //3.equals and hashcode implemented out of the box
  val him2 = new Person("him", 34)
  println(him == him2)


  //4. case classes have handy copy methods
  val him3 = him.copy(age = 45)
  println("him3 is: " + him3)

  //5. case classes have companion objects
  val thePerson = Person
  val mary = Person("Mary",23) // This delegates to Person's apply method

  //6. CCs are serializable - dealing with distributed systems..
  // dealing with aakkka framework

  //7. CCs have extractor patterns = can be used in pattern matching

  // will not get companion objects
  case object UnitedKingdom {

    def name: String = "The UK og "
  }


}
