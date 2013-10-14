package com.milo.scala

object Palindrome {
  
  def check (str:String) :Boolean=
  {

    if (str.length == 1 || str.length == 2 && str.charAt(0) == str.charAt(1)) 
      return true
    
    if (str.charAt(0) != str.charAt(str.length() -1))
      false
      else
    check(str.substring(1, str.length - 1))           

  }
  
  def palindromeNumber (number:Int) :Boolean =
  check (number.toString())
  
  
 
  
def main(args: Array[String]) :Unit = {
  
  val start = 101
  val end = 999
  var palindrome = 0
  for (i <- start to end if i%10>0; j <- start to end if (j%10>0))
  {
    val product = i*j
    palindrome = if (palindromeNumber(product) && product > palindrome)  {println(i +" * " + j + " = " + product); product} else palindrome
  }
  
  println(palindrome)
}
}