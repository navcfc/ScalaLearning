package part2oop

package part2oop

//impl of singly linked list
abstract class MyListGeneric[+A] {

  /*
  head - first element of list
  tail - remainder of list
  isEmpty - is list empty
  add(int) -> new List with this element added
  toString -> a string representation of the list
   */

  def head : A
  def tail : MyListGeneric[A]
  def isEmpty : Boolean
  def add[B >: A](element: B) : MyListGeneric[B]

  def printElements: String

  //polymorphic call
  override def toString: String = "[" + printElements + "]"

}


object Empty extends MyListGeneric[Nothing] {
  def head : Nothing = throw new NoSuchElementException
  def tail : Nothing = throw new NoSuchElementException
  def isEmpty : Boolean = true
  def add[B >: Nothing](element: B) : MyListGeneric[B] = new Cons(element, Empty)
  def printElements:String =""
}


class Cons[+A](h: A, t: MyListGeneric[A]) extends MyListGeneric[A] {
  def head : A = h
  def tail : MyListGeneric[A] = t
  def isEmpty : Boolean = false
  def add[B >: A](element: B) : MyListGeneric[B] = new Cons(element, this)
  def printElements : String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}


object ListTest extends App{

  val listOfIntegers: MyListGeneric[Int] = new Cons(1,new Cons(2,new Cons(3, Empty)))
  val listOfString : MyListGeneric[String] = new Cons("Hello", new Cons("Scala", Empty))

  println(listOfIntegers.toString)
  println(listOfString.toString)
}






