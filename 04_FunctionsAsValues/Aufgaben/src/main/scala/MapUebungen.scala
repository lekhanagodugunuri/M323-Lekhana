object MapUebungen {

  def main(args: Array[String]): Unit = {
    doubleNumbers(numbers);
    convertFirstLetterUpperCase(words);
    halfNumber(numbers2);

  }
  def doubleNumbers(numbers: List[Int]): List[Int] = {
    numbers.map(x => x * 2)
  }
  val numbers = List(1, 2, 3, 4, 5)
  val doubledNumbers = doubleNumbers(numbers)
  println(doubledNumbers)

  def convertFirstLetterUpperCase (words : List[String]): List[String] = {
    words.map(x => x.toUpperCase())
  }
  val words = List("Alice", "Bob", "Charlie")
  val uppercaseWords = convertFirstLetterUpperCase(words)
  println(uppercaseWords)

  def halfNumber(numbers2: List[Int]): List[Int] = {
    numbers2.map(x => x / 2)
  }
  val numbers2 = List(12, 45, 68, 100)
  val halfNumbers = halfNumber(numbers2)
  println(halfNumbers)








}


