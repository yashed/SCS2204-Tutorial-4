package Q2

object Q2 {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator must not be zero")

    private val g = gcd(n.abs, d.abs)
    val numerator: Int = n / g
    val denominator: Int = d / g

    def this(n: Int) = this(n, 1)

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def sub(other: Rational): Rational = {
      val newNumerator = numerator * other.denominator - other.numerator * denominator
      val newDenominator = denominator * other.denominator
      new Rational(newNumerator, newDenominator)
    }

    override def toString: String = s"$numerator/$denominator"
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result1 = x.sub(y)
    val result2= y.sub(z)
    val result3= z.sub(x)

    println(s"x = $x")
    println(s"y = $y")
    println(s"z = $z \n")
    println(s"x - y = $result1")
    println(s"y - z = $result2")
    println(s"z - x = $result3")
  }
}
