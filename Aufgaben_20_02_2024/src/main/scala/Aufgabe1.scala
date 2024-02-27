package org.jetbrains.scala

object Aufgabe1 {
  // Deklarativer Stil
  def wordScore(word: String): Int = word.replaceAll("a", "").length

  def main(args: Array[String]): Unit = {
    println(wordScore("imperative"))
    println(wordScore("no"))
    println(wordScore("declarative"))
    println(wordScore("yes"))
  }
}
