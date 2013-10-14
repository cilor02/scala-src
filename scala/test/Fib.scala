package com.milo.scala

object Fib {
  
  def fibTerm (last:Int)=
  {
    
    if (last < 3)
     1
    var prev = 1
    var b4Prev = 2
    for(i<- 2 to last)
    {
      var next = sumPrevs(prev, b4Prev) 
      b4Prev = prev
      prev = next
    }
    prev
  }
  
  def sumPrevs(last:Int, penult:Int) ={
    last + penult
  }
  
def main(args: Array[String]) :Unit = {
  
  println(fibTerm(5))
  
}
}