package Q1

object Q1 {
  def calculateAverage(temperatures: List[Int]): Double = {
    // Convert Celsius to Fahrenheit using map
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9.0 / 5.0) + 32)

    // Calculate the average of Fahrenheit temperatures using reduce
    val sumOfFahrenheit = fahrenheitTemperatures.reduce(_ + _)
    val averageFahrenheit = sumOfFahrenheit / temperatures.length

    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    val temperatures = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(temperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }
}
