package Tute5
import scala.io.StdIn.readInt
object Q6 {
  def fibonacci(num : Int):Int = num match{
    case 0 => 0
    case x if x == 1 => 1
    case _ => fibonacci(num-1) + fibonacci(num -2)
  }
  def fibonachchiSeq(num:Int): Any ={
    if(num >0) fibonachchiSeq(num-1)

    println(fibonacci(num));

  }

  def main(args:Array[String]):Unit={
    print("Enter a number =");
    val n = readInt()
    fibonachchiSeq(n);

  }

}
