package part2oop

object Inheritance4 extends App{

  //Scala has single class inheritance

  sealed class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")
//Protected accessed by subclass
  }

  class Cat extends Animal {

    val cat = new Cat
    cat.eat //Inhearinting all non private members
  }

  //constructors
  class Person(name: String, age:Int){
    //new constructor
    def this(name:String) = this(name, 0)
  }

  //THIS CODE WILL NOT COMPILE BECAUSE WJEM U INSTANTIATE THE DERIVED CLASS, THE JVM WILL NEED TO CALL THE CONSTRUCTORFROM TH E PARENT CLASS FIRST. So person constructor has to be called before adult constructor
  //This happens in the internals of JVM
  //class Adult(name:String, age:Int, idCard: String) extends Person

  class Adult(name:String, age:Int, idCard: String) extends Person(name, age) //THIS IS THE CORRECT WAY OF PASSING PARAMS
  class Adult1(name:String, age:Int, idCard: String) extends Person(name)

  //overriding

  class Dog extends Animal {
    override val creatureType ="domestic"
    override def eat= println("Crunch crunch")
  }

  val dog = new Dog
  dog.eat
  println(dog.creatureType)


  //Overriding the field in the construtor
  class Parrot(override val creatureType :String) extends Animal {
//    override val creatureType ="domestic"
    override def eat= {
      //implementtation of super
      super.eat
      println("chum chum")
    }
  }

  val parrot = new Parrot("bird")
  parrot.eat
  println(parrot.creatureType)


  //type substitution (polymorphism))
  //Method call will go to the most overriden version whenever possible
  val unknownAnimal : Animal = new Parrot("K9")

  unknownAnimal.eat //Each instance will know its derived instance function to call

  //overriding: supplying different implementations in derived classes
  //overloading: supplying multiple methods with different signatures but with same name in same class


  //super
  //used when we want to reference a method or field from parent class



  //preventing overrides
  //1- Use final on memeber
  //2- Final can be used on class itself
  //3 - seal the class = extend class in this file ONLY, BUT PREVENTS EXTENSION IN OTHER FILES
  //sealed is often used if u want to restrict type hierarchy. for eg only cats and dogs are the only animals alive. have them override in one file and no new animals will be written






}
