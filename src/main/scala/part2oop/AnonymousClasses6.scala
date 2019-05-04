package part2oop

object AnonymousClasses6 extends App{

  abstract class Animal {
    def eat : Unit
  }

  //anonymous class - new Animal with on spot implementation
  val funnyAnimal : Animal = new Animal {
    override def eat: Unit = println("Hahahahhaha")
  }
  /*
  equivalent of
  class part2oop.AnonymousClasses$$anon$1 extends Animal {
      override def eat: Unit = println("Hahahahhaha")

  }
   val funnyAnimal : Animal = new part2oop.AnonymousClasses$$anon$1
   */


  //Parametrized class can also be anonymous type
  //NEED TO IMPLEMENT ALL ABSTRACT FIELS/ METHODS!!!!!!!!!!
  class Person(name: String) {
    def sayHi : Unit = println(s"Hi my name is $name , how can i help")

  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println("Hi name is Jim")
  }
  println(funnyAnimal.getClass)





}
