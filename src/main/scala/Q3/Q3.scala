package Q3

object Q3 {

  val toUpper: String => String = str => str.toUpperCase()

  val toLower : String => String = str => str.toLowerCase()

  val vowels: String => Int = name => {
    val vowels = List('A', 'E', 'I', 'O', 'U')
    val vowelsCount = toUpper(name).count(vowels.contains)
    vowelsCount
  }

  def formatNames(name: String)(formatFn: String => String): String = formatFn(name)


  def format(str: String): String = {
    val vowelsCount = vowels(str)
    val length = str.length
    if (length % 2 == 1) {
      if (vowelsCount % 2 == 1) {
        toUpper(str);
      }
      else {
        toLower(str);
      }
    }
    else {
      if (vowelsCount < length / 2) {
        val formatname = str.take(1) + toUpper(str.charAt(1).toString) + str.slice(2, length);
        formatname
      }
      else {
        val formatname = str.slice(0, length - 1) + toUpper((str.charAt(length - 1)).toString);
        formatname
      }
    }

  }
  def main(args: Array[String]) = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    for (name <- names) {
      val formattedName = formatNames(name) { str =>
        format(name)
      }
      println(formattedName)
    }
  }

}
