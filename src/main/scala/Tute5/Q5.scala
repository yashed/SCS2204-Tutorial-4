package Tute5
import scala.io.StdIn.readInt

object Q5 {
  def OddEven(num: Int): Boolean = {
    if (num == 0) {
      false
    }
    else if (num == 1) {
      true
    }
    else {
      OddEven(num / 2);
    }
  }

  def EvenTot(num:Int):Int={
    if(num<=0){
      0
    }
    else if (OddEven(num)){

      (num-2) + EvenTot(num-2);
    }
    else{

      (num-1) +EvenTot(num-2);
    }
  }

  def main(args:Array[String]):Unit={
    print("Enter a number =")
    val x = readInt()
    println("Total of Even Numbers below "+ x + " = "+EvenTot(x));
  }

}
