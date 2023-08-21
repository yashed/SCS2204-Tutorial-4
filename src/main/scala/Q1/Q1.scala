package Q1

object Q1 {

  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator must not be zero")

    private val g = gcd(n.abs, d.abs)
    val numerator: Int = n / g
    val denominator: Int = d / g

    def this(n: Int) = this(n, 1)

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def neg(): Rational = new Rational(-numerator, denominator)

    override def toString: String = s"$numerator/$denominator"
  }


  def main(args: Array[String]): Unit = {
    val x = new Rational(3,9)
    val negX = x.neg()

    println(s"x = $x")
    println(s"-x = $negX")
  }

}


