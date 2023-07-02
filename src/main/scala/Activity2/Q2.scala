package Activity2

object Q2 {
  import scala.io.StdIn.readInt
def intCheck(x:Int):String= x match{
  case x if x<=0 => "Negative/Zero"
  case x if x%2==0 => "Even Number"
  case x if x%2 ==1 => "Odd Number"
}

  def main(args: Array[String]) = {
        print("Enter a Integer = ");
        val num = readInt();
        printf("Number is = "+ intCheck(num));
  }
}

