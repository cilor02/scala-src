package scala.test

object Fibinacci {
  
  def fibonacci(term:Int) :Int = 
  {
    
    if(term <2)   return 1;
    
    var prevLess=1
    var prev = 1
    var next = 1
    
for( i<- 2 to term)
{
  next = prevLess +  prev
  prevLess = prev
  prev = next
}
    next
  }
  
  
def addPrevs(i:Int, j:Int):Int = 
{
  i+j
}


def main(args: Array[String]) = {
  var term = 1
  var item = 0
  var tot = 0
  do 
  {
    tot += (if(item%2==0) item else 0);
    item = fibonacci(term)
    term+=1
  } while (tot + (if(item%2==0) item else 0)< 4000000)

println(tot)
}
}