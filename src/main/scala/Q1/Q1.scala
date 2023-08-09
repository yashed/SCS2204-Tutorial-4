package Q1

object Q1 {

  def filterEvenNumbers(li:List[Int]): List[Int] = {
    li.filter(li => li%2 ==0)
  }
  def main(args:Array[String]): Unit={
    val num = List(1,2,3,4,5,6,7,8,9,10)
    val evenNum = filterEvenNumbers(num)
    println("Even numbers = " + evenNum)
  }

}
