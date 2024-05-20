object FoldLeftUebungen {
  def main(args: Array[String]): Unit = {
    // Übung 1
    val numbers = List(1, 2, 3, 4, 5)
    val sum = numbers.foldLeft(0)(_ + _)
    println(s"Summe aller Zahlen: $sum")

    // Übung 2
    val strings = List("Hallo", " ", "Welt", "!")
    val combinedString = strings.foldLeft("")(_ + _)
    println(s"Kombinierter String: '$combinedString'")

    // Übung 3
    val points = List((1, 3), (2, 5), (4, 8), (6, 2))
    val (totalX, totalY, count) = points.foldLeft((0, 0, 0)) {
      case ((sumX, sumY, cnt), (x, y)) => (sumX + x, sumY + y, cnt + 1)
    }
    val centroid = (totalX.toDouble / count, totalY.toDouble / count)
    println(s"Schwerpunkt: $centroid")
  }
}
