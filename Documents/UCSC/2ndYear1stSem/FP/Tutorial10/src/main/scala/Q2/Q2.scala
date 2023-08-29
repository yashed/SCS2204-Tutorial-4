package Q2

object Q2 {

  def calculateLetters(values:List[String]):Int={

    val WordLen = values.map(word => word.length)
    val LetterCoount = WordLen.reduce(_+_)
    LetterCoount
  }

  def main(args:Array[String]):Unit={
    val values = List ("apple", "banana", "cherry", "date")
    println("Total count of letter occurrences: " + calculateLetters(values))
  }
}
