package sheets

import scala.collection.mutable.ArrayBuffer

object collections {
  
  // Arrays
  val nums = new Array[Int](10)                   //> nums  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  
  // The type here is inferred.
  val a = Array("Hello", "World")                 //> a  : Array[String] = Array(Hello, World)
  
  // access an element in Array
  a(0)                                            //> res0: String = Hello
  a(0) = "Goodbye"
  a(0)                                            //> res1: String = Goodbye
  
  // traverse the array elements
  for (element <- a) println(element)             //> Goodbye
                                                  //| World
	// traverse the array indexes
	for (i <- 0 until a.length) println(i)    //> 0
                                                  //| 1
 	// in the JVM, an Array is a JAVA Array!
	
  
  val a2 = new Array[Int](10)                     //> a2  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
 	// fill the array with something
 	for (i <- 0 until a2.length) a2(i) = i * i
 	
 	a2                                        //> res2: Array[Int] = Array(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
 	
 	// Scala version of JAVA's ArrayList
 	val b = new ArrayBuffer[Int]              //> b  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
 	
 	// add elements
 	b += 1                                    //> res3: sheets.collections.b.type = ArrayBuffer(1)
 	b += (1, 2, 3, 5)                         //> res4: sheets.collections.b.type = ArrayBuffer(1, 1, 2, 3, 5)
 	b ++= Array(8, 13, 21)                    //> res5: sheets.collections.b.type = ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
 	b                                         //> res6: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 2, 3, 5,
                                                  //|  8, 13, 21)

	val c = ArrayBuffer("Mary", "had", "a", "little", "lamb")
                                                  //> c  : scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Mary, had, a
                                                  //| , little, lamb)
	c                                         //> res7: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Mary, had, 
                                                  //| a, little, lamb)
	c += "its"                                //> res8: sheets.collections.c.type = ArrayBuffer(Mary, had, a, little, lamb, it
                                                  //| s)
	c+= ("fleece", "was", "white")            //> res9: sheets.collections.c.type = ArrayBuffer(Mary, had, a, little, lamb, it
                                                  //| s, fleece, was, white)
	c ++= Array("as", "snow")                 //> res10: sheets.collections.c.type = ArrayBuffer(Mary, had, a, little, lamb, i
                                                  //| ts, fleece, was, white, as, snow)

	// remove element from the middle
	c.remove(3)                               //> res11: String = little
	c                                         //> res12: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Mary, had,
                                                  //|  a, lamb, its, fleece, was, white, as, snow)
	
	// insert element in the middle
	c.insert(3, "medium-sized")
	c                                         //> res13: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Mary, had,
                                                  //|  a, medium-sized, lamb, its, fleece, was, white, as, snow)
	
	// remove the last 5 elements
	c.trimEnd(5)
	c                                         //> res14: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Mary, had
                                                  //| , a, medium-sized, lamb, its)
                                                 
  // conversion between buffers and arrays:
  var d = c.toArray                               //> d  : Array[String] = Array(Mary, had, a, medium-sized, lamb, its)
  val e = a.toBuffer                              //> e  : scala.collection.mutable.Buffer[String] = ArrayBuffer(Goodbye, World)
  d                                               //> res15: Array[String] = Array(Mary, had, a, medium-sized, lamb, its)
  e                                               //> res16: scala.collection.mutable.Buffer[String] = ArrayBuffer(Goodbye, World
                                                  //| )
                                                  
  // transform an Array
  val arr = Array(2, 3, 5, 7, 11)                 //> arr  : Array[Int] = Array(2, 3, 5, 7, 11)
  
  // result is a new Array
  val result = for (elem <- arr) yield 2 * elem   //> result  : Array[Int] = Array(4, 6, 10, 14, 22)
  
  // common Array algorithms
  Array(1, 7, 2, 9).sum                           //> res17: Int = 19
  ArrayBuffer("Mary", "had", "a", "little", "lamb").max
                                                  //> res18: String = little
  // the result is new Array,
  // the original Array is not mutated
  ArrayBuffer(1, 7, 2, 9).sorted                  //> res19: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 7, 9)
	ArrayBuffer(1, 7, 2, 9).reverse           //> res20: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(9, 2, 7, 1)
	
	// toString
	Array(1, 2, 3).toString                   //> res21: String = [I@50f8360d
	Array(1, 2, 3).mkString(" | ")            //> res22: String = 1 | 2 | 3
	
}