package com.milo.scala

import scala.util.Random

object RandomDimension {

  
  def randomPoint ( col:Int, row:Int): (Int, Int) = 
  {
     (Random.nextInt(col),Random.nextInt(row))
  }
  
  def main(args: Array[String]) :Unit = 
  {
  
    for (i<- 1 to 4)
    {
    val selection = RandomDimension.randomPoint(4, 4)
    println(selection)
    }
  }
  
}