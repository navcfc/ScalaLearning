package part2oop

object AbstractDataTypes extends App{

  //abstract - Classes which contain unimplemented orr abstract unimplemented or abstract fiels or methods
  abstract class Animal {
    //abstract fields and methods because values are not specified. abstract classes cannot be instantiated.
    val creatureType: String
    def eat: Unit
  }


  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat :Unit = println("crunch crunch")
  }

  //traits

  trait Carnivore {
    def eat (eat:Animal) : Unit

  }

  trait ColdBlooded
  //We can see how a class extends trait and we can have multiple traits extended
  class Crocodile extends Animal with Carnivore with ColdBlooded {

     val creatureType: String = "croc"
    def eat:Unit =println("nomnomnom")
    def eat(animal: Animal):Unit = println(s"Im a croc and im eating ${animal.creatureType}")

  }


  val dog = new Dog
  val crocodile = new Crocodile

  crocodile.eat(dog)


  //traits vs abstract classes
 // AC can have both abstract and non abstract members
  //and traits also have both A and N-A members
  //1-traits cannot have constructor params
  //2-extend 1 class but multiple traits by sa,me class
  //3- traits are behaviours, abstract class is a type of thing

  //Type Hierarchy
  /*
    scala.Any <-  scala.AnyRef(java.lang.Object) <- String, set,List <- Null extends everythign <-Scala Nothing
    scala.Any <- scala.AnyVal(Int, Unit, Boolean) <-Scala Nothing

Scala nothing is a subtype of ever thing in scala. Notihnig is no instance of anything at all.
   */



}
