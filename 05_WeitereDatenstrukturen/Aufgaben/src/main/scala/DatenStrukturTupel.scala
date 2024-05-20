import java.time.LocalTime


object DatenStrukturTupel {
  def main(args: Array[String]): Unit = {
    // Aufgabe 1
    def wetterFunktion(): (String, LocalTime, Double) = {
      val wetterBeschreibung = "sonnig"
      val aktuelleZeit = LocalTime.now()
      val aktuelleTemperatur = 22.5
      (wetterBeschreibung, aktuelleZeit, aktuelleTemperatur)
    }

    val wetterDaten = wetterFunktion()
    println(s"Wetterdaten: $wetterDaten")

    // Aufgabe 2
    val wetterListe: List[(String, String, Double)] = List(
      ("Berlin", "sonnig", 18.0),
      ("Hamburg", "regnerisch", 15.5),
      ("München", "sonnig", 22.3),
      ("Köln", "bewölkt", 19.2),
      ("Frankfurt", "sonnig", 23.1)
    )

    def stadtMitWarmerTemperatur(wetterListe: List[(String, String, Double)], temperaturGrenze: Double): List[String] = {
      wetterListe.filter { case (_, _, temp) => temp > temperaturGrenze }.map { case (stadt, _, _) => stadt }
    }

    val warmeStädte = stadtMitWarmerTemperatur(wetterListe, 20.0)
    println(s"Städte mit Temperatur über 20 Grad: $warmeStädte")

    // Zusatzaufgabe
    def trending(rates: List[BigDecimal]): Boolean = {
      rates.zip(rates.drop(1)).forall { case (prev, curr) => curr > prev }
    }

    val kursWerte1 = List(BigDecimal(1), BigDecimal(4), BigDecimal(3), BigDecimal(8))
    val kursWerte2 = List(BigDecimal(1), BigDecimal(2), BigDecimal(3), BigDecimal(8))

    println(s"Trend für kursWerte1: ${trending(kursWerte1)}")
    println(s"Trend für kursWerte2: ${trending(kursWerte2)}")
  }
}
