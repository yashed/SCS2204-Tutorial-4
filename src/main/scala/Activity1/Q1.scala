package Activity1
import scala.io.StdIn.readInt
object Q1 {

  def Interest(deposit:Int):Double=deposit match {
    case deposit if deposit <=0 => 0
    case deposit if deposit< 20000 => deposit*0.02
    case deposit if deposit < 200000 => deposit*0.04
    case deposit if deposit < 2000000 => deposit *0.35
    case deposit if deposit > 2000000 => deposit *0.65
  }

  def main(args:Array[String])={
    print("Enter Deposit Amount = ")
    val deposit = readInt();
    println("Interest is = Rs. "+ Interest(deposit));
  }



}
