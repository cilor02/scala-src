package com.milo.scala

object ScalaTest {
  
def main(args: Array[String]) :Unit = {
  
  val list = 1 to 100
  for (i <- list if(i % 25 == 0)){
    println(i)
  }
  
  
  val subList = for {i <- list if(i % 20 == 0)
  
    
  }
 yield i
  subList foreach println
}
}