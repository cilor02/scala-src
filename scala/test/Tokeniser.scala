package scala.test

import scala.collection.mutable.ListBuffer

class ToKeniser(val phrase:String) {
  var latestChar:Char;
  var pos:Int = 0;
  val tokens = Nil
  
  def getNext :Char = {
   
    val ch:Char = phrase.charAt(pos)
    pos+=1
    ch
  }
  def createOpToken ={}
  def extractNumber ={}
  def extractVariable ={}
 
def tokenise() = {
 
  latestChar = getNext
  
  latestChar  match {
    
    case '+'|'-'|'*'|'/' => createOpToken
    case '1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9' => extractNumber
    case ' ' => latestChar = getNext
    case '_' => extractVariable
    case _ => latestChar.isLetter 
  }
}


def main(args: Array[String]) = {
}
}