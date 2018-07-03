package sheets

object loops {
  
  val n = 2                                       //> n  : Int = 2
  for (i <- 1 to n) println(i)                    //> 1
                                                  //| 2
  
  for (i <- "Hello") println(i)                   //> H
                                                  //| e
                                                  //| l
                                                  //| l
                                                  //| o
  // Multiple "generators"
  for (i <- 1 to 3; j <- 1 to 3) println("i: " + i + " j: " + j)
                                                  //> i: 1 j: 1
                                                  //| i: 1 j: 2
                                                  //| i: 1 j: 3
                                                  //| i: 2 j: 1
                                                  //| i: 2 j: 2
                                                  //| i: 2 j: 3
                                                  //| i: 3 j: 1
                                                  //| i: 3 j: 2
                                                  //| i: 3 j: 3
  // Guards
  for (i <- 1 to 3; j <- 1 to 3 if i != j) println("i: " + i + " j: " + j)
                                                  //> i: 1 j: 2
                                                  //| i: 1 j: 3
                                                  //| i: 2 j: 1
                                                  //| i: 2 j: 3
                                                  //| i: 3 j: 1
                                                  //| i: 3 j: 2
                                                  
  // Collecting results
  for (i <- 1 to 10) yield i % 3                  //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 0, 1, 2, 0, 
                                                  //| 1, 2, 0, 1)
}