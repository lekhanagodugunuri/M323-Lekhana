object MapUebungen {

  def main(args: Array[String]): Unit = {
    doubleNumbers(numbers);
    convertLetterUpperCase(words);
    halfNumber(numbers2);
    formatiereAdressen(adressen).foreach(println);
    extrahiereVornamenInGrossbuchstaben(namen).foreach(println);

  }
  // Übung 1
  def doubleNumbers(numbers: List[Int]): List[Int] = {
    numbers.map(x => x * 2)
  }
  val numbers = List(1, 2, 3, 4, 5)
  val doubledNumbers = doubleNumbers(numbers)
  println(doubledNumbers)

  // Übung 2
  def convertLetterUpperCase (words : List[String]): List[String] = {
    words.map(x => x.toUpperCase())
  }
  val words = List("Alice", "Bob", "Charlie")
  val uppercaseWords = convertLetterUpperCase(words)
  println(uppercaseWords)

  // Übung 3
  def halfNumber(numbers2: List[Int]): List[Int] = {
    numbers2.map(x => x / 2)
  }
  val numbers2 = List(12, 45, 68, 100)
  val halfNumbers = halfNumber(numbers2)
  println(halfNumbers)

// Übung 4
  case class Adresse(strasse: String, hausnummer: Int, postleitzahl: String, stadt: String)

  val adressen = List(
    Adresse("Hauptstrasse", 10, "12345", "Musterstadt"),
    Adresse("Nebenstrasse", 5, "23456", "Beispielburg")
  )

  val namen = List("Max Mustermann", "Erika Mustermann")

  def formatiereAdressen(adressen: List[Adresse]): List[String] = {
    adressen.map(adresse =>
      s"${adresse.strasse} ${adresse.hausnummer}, ${adresse.postleitzahl} ${adresse.stadt}"
    )
  }

  // Übung 5
  def extrahiereVornamenInGrossbuchstaben(namen: List[String]): List[String] = {
    namen.map(name => name.split(" ").head.toUpperCase)
  }


}


