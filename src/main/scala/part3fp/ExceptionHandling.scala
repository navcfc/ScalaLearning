package part3fp

import scala.util.{Failure, Success, Try}

object ExceptionHandling extends App{

  //create success pr faailure explicitly
  val aSuccess = Success(3)
  val aFailure = Failure(new RuntimeException("SUPER FAILRE"))

  println(aSuccess)
  println(aFailure)

  //No need to create success and failure everytime because Try companion objects apply method takes care for u

  def unsafeMethod(): String= throw new RuntimeException("NO STRING FOR U ")

  //Try objects via the apply method
  val potentialFailure = Try(unsafeMethod())

  println(potentialFailure)

  //syntax sugar
  val anotherPotentialFailure = Try {
    //code that might throw

  }


  //utilities
  println(potentialFailure.isSuccess)

  //orElse
  def backupMethod() : String = "A valid result"
  val fallBackTry = Try(unsafeMethod()).orElse(Try(backupMethod()))
  println(fallBackTry)

  //IF YOU DESIGN THE API,WRAP COMPUTATION IN TRY INSTEAD

  def betterUnsafeMethod() : Try[String] = Failure(new RuntimeException)
  def betterBackUpMethod() : Try[String] = Success("A valid result")

  def betterFallBack = betterUnsafeMethod() orElse betterBackUpMethod()


  //Try also has map,flatmap,filter
  println(aSuccess.map(_ * 2))
  println(aSuccess.flatMap(x => Success(x * 10)))

  println(aSuccess.filter(_ > 10))//this success will be converted to a faoilure








}
