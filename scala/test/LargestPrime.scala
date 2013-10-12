package scala.test

object LargestPrime {
  
  def largestPrime(j:Int) = 
  {
    var num =  j
    var i:Int = 2
    var max = i
    while (max < num)
    {
    while (num%i == 0)
    {
      num/=i
      max = if(max <= i)i else max
    }
     i+=1
    }
    max
  }



def main(args: Array[String]) = {
  
val prime = largestPrime(63)
println(prime)
}
}