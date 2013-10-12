package scala.test

object Euler1 {
def addRange():Unit = 
{
  var tot = 0
  val list2 = 0 until 1000 filter {i => i%5==0} foreach (i=>tot+=i)
  println(tot)
}

def addRange2():Unit = 
{
  var tot = 0
for(i<-0 until 1000 if (i%3==0 )) tot+=i;  println((tot))
}
def main(args: Array[String]) = {
  
var tot = 0
//for(i<-0 until 1000 if (i%5==0 )) tot+=i;  println((tot))
addRange
addRange2
}
}