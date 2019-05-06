package part2oop

object Generics5 extends App{

  //denotes a generic type
  class MyList[+A] {
    //use the type A

    def add[B >: A](element : B ) : MyList[B] = ???

    /*
      A = Cat
      B = Dog = Animal
     */
  }

  class MyMap[Key,Value]
  val listOfIntegers= new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic methods
  object MyList {
    def empty[A] : MyList[A] = ???

  }

  val emptyListOfIntegers = MyList.empty



  //Variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //if cat extends animal 3 possible solutions
  //1 - List of cat extends list of animals.. its called covarianec

  class CoVariantList[+A]

  val animal: Animal = new Cat
  val animalList: CoVariantList[Animal] = new CoVariantList[Cat]
  // animalList.add(new Dog) WILL THIS BE OKAY? -- HARD QUESTION == We return a list of animals

  //2 - No . List of cats and animals are two separatw wthigns. - INVARIANCE LIST

  class InvariantList[A]

  val invariantAnimalList : InvariantList[Animal] = new InvariantList[Animal]
  // Cat cannot be instantiated.

  //3 - counter intuittive , opposite relationship
  //Hell, NO!
  //CONTRAVARIANCE

  class ContravariantList[-A]
  val contravariantList : ContravariantList[Cat] = new ContravariantList[Animal]


  //bounded types
  //allow to use generic classes for a certain types that are
  // either a subclass or a superclass of a different type
  class Cage[A <: Animal](animal: A) //class cage only expects subtypes of animals
  //if its >: Cage only expects super type of animals
  val cage = new Cage(new Dog)

  //Will not be able to run it coz of type parameters bound!
  class Car
  //generic type needs proper Bounded type
 // val newCage = new Cage(new Car)



  //expand MyList to be Generic





}
