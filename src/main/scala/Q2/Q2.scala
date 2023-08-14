package Q2
import scala.io.StdIn.readInt
object Q2 {

  val status : Int => String ={
    case num if num < 0 => "Negetive"
    case num if num == 0 => "Zero"
    case num if num%2 == 0 => "Even"
    case num if num%2 ==1 => "Odd"
  }

  def main(args:Array[String]): Unit = {
    print("Enter a number =");
    val num = readInt();
    println("Number is " + status(num));
  }

}
