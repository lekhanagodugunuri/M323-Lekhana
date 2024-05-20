object FlatMapUebungen {
  def main(args: Array[String]): Unit = {
    // Übung 1
    val listOfLists = List(List(1, 2), List(3, 4), List(5, 6))
    val doubledNumbers = listOfLists.flatMap(subList => subList.map(_ * 2))
    println(s"Verdoppelte Zahlen: $doubledNumbers")

    // Übung 2
    val people = List(
      ("Max", List("Blau", "Grün")),
      ("Anna", List("Rot")),
      ("Julia", List("Gelb", "Blau", "Grün"))
    )
    val uniqueColors = people.flatMap(_._2).distinct
    println(s"Einzigartige Farben: $uniqueColors")
  }
}
