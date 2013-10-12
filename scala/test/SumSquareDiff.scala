package scala.test

object SumSquareDiff {
  
def diffSquareSum(i:Int) = {
  val listNums = List.range(1, i)
  
val sum =   listNums.foldLeft(0)(_ + _)
val squares = listNums map (x=> x*x)
val sumSquares = squares.foldLeft(0)(_ + _) 
sum * sum - sumSquares
}


def main(args: Array[String]) = {
println(diffSquareSum(100))
}
}