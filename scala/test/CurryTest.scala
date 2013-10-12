package scala.test

object CurryTest {

  
  
def process2Ints (a:((Int,Int) => Int)):Unit = {println() }
def process2Ints2 (a:((Int,Int) => Int),i:Int, j:Int):Unit = {println(a(i,j)) }
def curry(x:Int)(y:Int)={ x+ y}

def sum(i:Int, j:Int){i+j}

def main(args: Array[String]) = {
  

 val i = 2
 val j = 3
 
 val fAdd = (ii:Int,jj:Int)=> ii+jj;
 val fMul = (ii:Int,jj:Int)=> ii*jj;
 
 val func = curry(3)_;
 println(func(4))
 
 println(curry(12)(12));
 //fAdd(2,4);
 //sum(2,4)
 //process2Ints2(fAdd,2,3)
 //process2Ints2(fMul);
 //process2Ints2 ((i,j)=> i +j,2,3);
 
 //process2Ints2 ((i,j)=> i*j,2,3);
 
 //process2Ints2(fAdd,2,4);
 //process2Ints2(fMul,2,4)


}
}