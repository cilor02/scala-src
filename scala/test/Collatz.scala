package com.milo.scala

object Collatz {
  
  def next (i:Int) =
        i%2 match {
           
           case 1 => 3 * i + 1
           
           case _ => i/2
         }

  
  def collatz (i:Int)
  { 
    print(i + "->");
    if (i==1)
    {
     println 
      1
    }
    else
     collatz(next(i))
  }
  

  
  
 
  
def main(args: Array[String]) :Unit = {
  collatz(201);
}
}