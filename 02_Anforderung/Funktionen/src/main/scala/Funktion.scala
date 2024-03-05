class Funktion {
  def berechneRabatt(preis: Double): Double = {
    val rabattierterPreis = preis * 95 / 100
    rabattierterPreis
  }
}

object Main extends App {
  val funktion = new Funktion()
  val preis = 100.0
  val rabattierterPreis = funktion.berechneRabatt(preis)
  println("Der Preis nach dem Rabatt beträgt: " + rabattierterPreis)
}
