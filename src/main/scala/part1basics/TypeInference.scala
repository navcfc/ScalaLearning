package part1basics

object TypeInference extends App{

  //Compiler infers the type from the right hand side

  val x = 2 //Compiler makes out its an int
  val y = x + "Hello" // For compiler int + string = string. So y is a string

  //Compiler also looks at the implementation and figures out the return type


  //For a recursive function, compiler is not able to infer the type, so the return type has to be passed
}
