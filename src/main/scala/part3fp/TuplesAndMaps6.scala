package part3fp

object TuplesAndMaps6 extends App{

  //tuples- finite ordered, kind of like lists
  val aTuple = new Tuple2(2,"HELLO SCALA") //Tuple2[Int,String] = (Int, String) // No need of new Tuple2
  //can group 22 elements of diff types

  println(aTuple._1) //1st element

  println(aTuple.copy(_2 = "goodbye java"))
  println(aTuple.swap)

  //Maps- keys to Values.. keys are index, valuesa re values for that key

  val aMap :Map[String, Int] = Map()

  val phoneBook = Map(("Jim",555),"Daniel" ->789 ).withDefaultValue(-1) //tuples
  //a -> b sytactic sugar for (a,b)

  //map operators
  println(phoneBook.contains("Jim"))
  println(phoneBook("Jim"))


  //add a pairing
  val newPairing = "Mary" -> 678
  val newPhoneBook = phoneBook + newPairing
  println(newPhoneBook)

  //functionals on maps
  //map,flatMap,filter

  println(phoneBook.map(pair => pair._1.toLowerCase -> pair._2))

  //filterKeys
  println(phoneBook.filterKeys(_.startsWith("J")))

  //mapValues
  println(phoneBook.mapValues(number => number * 10))

  //conversions to other collections
  println(phoneBook.toList)
  println(List(("Daniel",555)).toMap)

  val names = List("Bob", "James" , "Angel" , "Mary", "Dan" ,"Jim")
  println(names.groupBy(name => name.charAt(0)))




}
