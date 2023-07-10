package Tute5
import scala.io.StdIn.readInt
object Q4 {

  def OddEven(num:Int):String={
    if(num == 0){
      "Odd";
    }
    else if(num==1){
      "Even";
    }
    else{
      OddEven(num/2);
    }
  }

  def main(args:Array[String]):Unit={
    print("Enter a number =");
    val num = readInt();
    println("Number is "+ OddEven(num));
  }

}
