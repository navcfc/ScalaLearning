package part2oop

object Objects {

  //SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY// DOES NOT KNOW THE CONCEPT OF STATIC
  //AN OBJECT ITSELF HAS A STATIC LIKE FUNCTIONALITY

  object  Person { //TYPE + ITS ONLY INSTANCE

    //class level functionality = static
    //Can be done for functions without params
    val N_EYES = 2 // IN JAVA IT WAS STATIC FINAL STRING
    def canFly : Boolean = false

    //factory method coz whole purpose is to build Persons given some PARAMS
    def apply(mother:Person, father: Person ): Person = new Person("Bobby")

  }

  class Person(val name: String)
  {
    //instance level fucntionality

  }

  //COMPANIONS -- same object or class with same NAMES in same SCOPE.. THE WHOLE CODE WE WILL WRITE IN WILL EITHER RESIDE IN CLASS VIA INSTANCE or OBJECT VIA SINGLETON INSTANCE

  //An object is used a singleton instance
  def main (args : Array[String]) : Unit = {
  val mary = Person //ONLY INSTANCE OF mary
  val john = Person
  println(mary == john) // SINGLE INSTANCE WITH THE NAME PEERSON


  val mary1 = new Person("Mary")
  val john1 = new Person("John")
  println(mary1 == john1)


  val bobbie = Person(mary1, john1)
  }

  //Scala Applications = scala object with
  //def main (args : Array[String]) : Unit
}
