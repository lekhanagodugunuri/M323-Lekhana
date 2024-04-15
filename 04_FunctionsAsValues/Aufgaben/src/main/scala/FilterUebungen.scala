object FilterUebungen {

  def main(args: Array[String]): Unit = {


    println(evenNumbers)
    println(longNames)
    println(largeNumbers)
    println(wordsWithS)
    println(earlyPublishedBooks)
  }

  // Übung 1
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(_ % 2 == 0)
  }

  // Übung 2
  def filterLongNames(names: List[String]): List[String] = {
    names.filter(_.length > 4)
  }

  // Übung 3
  def filterNumbersGreaterThan50(numbers: List[Int]): List[Int] = {
    numbers.filter(_ > 50)
  }

  // Übung 4
  def filterWordsStartingWithS(words: List[String]): List[String] = {
    words.filter(_.startsWith("S"))
  }

  // Übung 5
  case class Buch(titel: String, autor: String, jahr: Int)

  def filterBooksPublishedBefore1950(books: List[Buch]): List[String] = {
    books.filter(_.jahr < 1950).map(_.titel)
  }

  // Beispielaufrufe
  val evenNumbers = filterEvenNumbers(List(1, 2, 3, 4, 5))
  val longNames = filterLongNames(List("Alice", "Bob", "Charlie", "Diana"))
  val largeNumbers = filterNumbersGreaterThan50(List(12, 45, 68, 100))
  val wordsWithS = filterWordsStartingWithS(List("Scala", "ist", "fantastisch"))
  val buecher = List(Buch("1984", "George Orwell", 1949), Buch("Brave New World", "Aldous Huxley", 1932), Buch("Fahrenheit 451", "Ray Bradbury", 1953))
  val earlyPublishedBooks = filterBooksPublishedBefore1950(buecher)



}
