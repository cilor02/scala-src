package scala1

import scala.swing.MainFrame
import java.awt.Dimension
import scala.swing.TextArea
import scala.swing.MenuBar
import scala.swing.Menu
import scala.swing.MenuItem

object Scala1 {

  
  def main (args: Array[String]) = { 
    
 val frame = new MainFrame {
   title = "Hello World!"
     contents = new TextArea
     menuBar = new MenuBar {
     contents += new Menu ("File"){
       contents += new MenuItem("Open"){
         
       }
       contents += new MenuItem("Close"){
         
       }
       contents += new MenuItem("Save")


       
     }
   }
   size  = new Dimension (500, 500);
   
 }      
    frame visible = true
  }
}