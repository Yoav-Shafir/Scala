package sheets

object types {
  
  // Int, Double, Byte, Char, Short, Long, Float, Boolean.
  // Everything is scala is an object:
  
  1.to(10)                                        //> res0: scala.collection.immutable.Range.Inclusive = Range 1 to 10
  
  // String are the same as in JAVA but scala adds tons of extra methods:
  "Hello".intersect("World")                      //> res1: String = lo
  
  1.to(10)                                        //> res2: scala.collection.immutable.Range.Inclusive = Range 1 to 10
  
  // we can also write it as:
  1 to 10                                         //> res3: scala.collection.immutable.Range.Inclusive = Range 1 to 10
  
  // in scala there is no ++, -- operators
  // you do it like this
  var counter = 0                                 //> counter  : Int = 0
  counter += 1
  counter                                         //> res4: Int = 1
}