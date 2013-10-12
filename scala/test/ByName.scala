package scala.test

object ByName {


 def triple(block: =>Int) :Int = block * 3
 


def main(args: Array[String]) = {
 
 println(triple(1+1))
   
}
}