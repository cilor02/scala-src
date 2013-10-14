package com.milo.scala

object SmallestMultiple {
  
  def lcmUptoCase (num:Int) :Int=
  {
      num match
      {
        case 1 =>
        num
        case 2 =>
        num
        case _ =>
          {
            var lcm =  lcmUptoCase ( num - 1)
            var hcf = hcfFunc(num, lcm)
            num * lcm /hcf
          }
      }
      
      

  }
  
  def lcmUpto (num:Int) :Int=
  {
    if(num < 3)
    {
      return num
    }
      var lcm =  lcmUpto ( num - 1)
      var hcf = hcfFunc(num, lcm)
      num * lcm /hcf
  }
  
  	def hcfFunc(i:Int, j:Int ):Int =
	{
		var big=0;
		var small=0;
		if(i>j)
		{
			big=i;
			small=j;
		} else
		{
			big=j;
			small=i;
		}
		
		if (big%small == 0) small else hcfFunc(small,big%small);
	}
  
 
  
def main(args: Array[String]) :Unit = {
  
  println(lcmUptoCase(18))
  
}
}