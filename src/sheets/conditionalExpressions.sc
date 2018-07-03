package sheets

object conditionalExpressions {
  
  val x = 4                                       //> x  : Int = 4
  
  // in scala an `if` expression has a value
  if (x > 0) 1 else -1                            //> res0: Int = 1
  
  // the type here is `Any`,
  // this is the common supertype of the branches
  // `Any` is like the `Object` type in JAVA
  if (x > 0) "positive" else -1                   //> res1: Any = positive


	val result = if (x < 0) "positive"        //> result  : Any = ()
	result                                    //> res2: Any = ()
	
	// what is `()` notation?
	// its type `Unit`
	// in scala `Unit` is similar to void, but it has
	// one value, denoted ()
	var result2 = ()                          //> result2  : Unit = ()
	
	// value of a block is the value of the
	// last expression
	val fullName = {
		val fname = "Yoav"
		val lname = "Shafir"
		fname + " " + lname
	}                                         //> fullName  : String = Yoav Shafir
		
	fullName                                  //> res3: String = Yoav Shafir
	
	// if the last expression is an assignment,
	// the block value is ()
	var n = 0                                 //> n  : Int = 0
	val result3 = while (n < 2) {
		println(n)
		n += 1
	}                                         //> 0
                                                  //| 1
                                                  //| result3  : Unit = ()
  result3
}