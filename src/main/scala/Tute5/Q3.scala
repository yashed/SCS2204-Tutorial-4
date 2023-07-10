package Q3
import scala.io.StdIn.readInt

object Q3 {
  def sum(num :Int ):Int={
    if(num ==0){
      0
    }
    else{
      num+sum(num-1);
    }
  }
  def main(args:Array[String]):Unit={
    print("Enter a Number =");
    val num = readInt();
    println("Addition of number 1 to "+ num + " = "+sum(num));

  }

}
