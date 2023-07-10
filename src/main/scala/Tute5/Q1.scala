package Tute5
import scala.io.StdIn.readInt
object Q1 {
  def GCD(x:Int , y:Int):Int=y match {
    case 0 => x;
    case a if a>x => GCD(a,x);
    case _=> GCD(y,x%y);
  }

  def prime(p:Int , q:Int=2):Boolean = q match {
    case y if(p == y) => true
    case x if GCD(x,p) >1 => false
    case x=> prime(p,x+1)
  }


  def main(args:Array[String]):Unit={
    print("Enter a number =");
    val x = readInt();
    if(prime(x))
      {
        println(x + " is a prime number");
      }
      else{
      println(x + " is not a prime number");
    }
  }


}
