package sheets

object functions {
	import scala.math._

	// we dont put the () on the `length` method
	// because it doesnt mutate the String.
	"Hello".length                            //> res0: Int = 5
	
	// TODO: apply()
	
	1.to(10)                                  //> res1: scala.collection.immutable.Range.Inclusive = Range 1 to 10
	
	1.to(10).map(sqrt(_))                     //> res2: scala.collection.immutable.IndexedSeq[Double] = Vector(1.0, 1.41421356
                                                  //| 23730951, 1.7320508075688772, 2.0, 2.23606797749979, 2.449489742783178, 2.64
                                                  //| 57513110645907, 2.8284271247461903, 3.0, 3.1622776601683795)
  1 to 10 map(sqrt(_))                            //> res3: scala.collection.immutable.IndexedSeq[Double] = Vector(1.0, 1.41421356
                                                  //| 23730951, 1.7320508075688772, 2.0, 2.23606797749979, 2.449489742783178, 2.64
                                                  //| 57513110645907, 2.8284271247461903, 3.0, 3.1622776601683795)
  
  6 * 7                                           //> res4: Int(42) = 42
  6.*(7)                                          //> res5: Int(42) = 42
  
  "Mississippi".distinct                          //> res6: String = Misp
  
  "ABC".sum                                       //> res7: Char = Æ
  'A' + 'B' + 'C'                                 //> res8: Int = 198
  ('A' + 'B' + 'C').toChar                        //> res9: Char = Æ
  'Æ'.toInt                                       //> res10: Int = 198
  
  
  // To define a function , specify name, parameters, body:
  // the return type here is infered
  def abs(x: Double) = if (x >= 0) x else -x      //> abs: (x: Double)Double
  
  // For recursive funtion we must define the return type:
  def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)
                                                  //> fac: (n: Int)Int

  // Function that doesnt return anything, it just has some side effect
  def box(s: String) { // Look carefully: no =
  	val border = "-" * s.length + "--\n"
  	println(border + "|" + s + "|\n" + border)
  }                                               //> box: (s: String)Unit
  
  box("Hello")                                    //> -------
                                                  //| |Hello|
                                                  //| -------
                                                  //| 
                                                  
  // Named argument is useful for greater clarity:
  	
  	
  // Default args let you omit argument values
  def decorate(str: String, left: String = "[", right: String = "]") = left + str + right
                                                  //> decorate: (str: String, left: String, right: String)String
  
  decorate("Hello")                               //> res11: String = [Hello]
  decorate("Hello", "<<<")                        //> res12: String = <<<Hello]
  
  // here `right` is a Named argument
  decorate("Hello", right = ">>>")                //> res13: String = [Hello>>>
  
  // Variable number of arguments indicated with * after type:
  def sum(args: Int*) = {
  	var result = 0
  	for (arg <- args) result += arg
  	result
  }                                               //> sum: (args: Int*)Int
  
  sum(3, 3, 3)                                    //> res14: Int = 9
}