package part2oop

object MethodNotations2 extends App{

  class Person(val name: String, favMovie: String) {//If we declare outside, it will conflict with the Person clss in the same package

    def likes(movie: String) : Boolean = movie ==favMovie

    def hangOutWith(person: Person) : String = s"{this.$name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, Wjat the HECK!"

    def isAlive: Boolean = true

    def apply() :String = s"Hi my name is $name and my fav movie is $favMovie"

  }

  val mary = new Person("Mary","Inception")

  println(mary.likes("Inception"))

  println(mary likes "Inception") //Two expressions are equivalent
  // This is called infix notation/ or operator notation(SYNTACTIC SUGAR)
  //only works with one paramters



  //"operators" in scala

  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)

  println(1 + 2)
  println(1.+(2)) //ALL OPERATORS ARE METHODS



  //prefix notation -- another form of syntactic sugar.. all about unary operators

  val x= -1
  val y = 1.unary_-
  //UNARY_ prefix works with - + ~ !

  println(!mary)
  println(mary.unary_!)



  //Postfix notation -- ONLY FOR METHODS WITHOUT PARAMETERS

  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) // EQUIVALENT


}
