object declaringVariables {
  
  // `val` means that this is an immutable variable,
  // re assignment to the variable is ilegal in scala.
  // scala can tell that this variable is of type `Int`
  val answer = 8 * 5 + 2                          //> answer  : Int = 42
  
  answer                                          //> res0: Int = 42
  
  // compile error!
  // answer = 43
  
  // `var` let us re assign value if we want to.
  var response = 42                               //> response  : Int = 42
  response = 43
  response                                        //> res1: Int = 43
  
  // this is still strongly typed,
  // compile error - type mismatch
  // response = "hello"
  
  // no primitive types in scala everything is a class:
  // Int, Double, Boolean, String etc...
  
  var greeting: String = null                     //> greeting  : String = null
  
}