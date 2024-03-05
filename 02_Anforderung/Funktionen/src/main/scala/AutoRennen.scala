class Autorennen {
  def gesamtzeitBerechnen(rundenzeiten: List[Double]): Double = {
    rundenzeiten.sum
  }

  def durchschnittszeitBerechnen(rundenzeiten: List[Double]): Double = {
    val rundenOhneWarmUp = rundenzeiten.drop(1)
    val summeOhneWarmUp = rundenOhneWarmUp.sum
    summeOhneWarmUp / rundenOhneWarmUp.length
  }
}

object Beispiel2Main extends App {
  val autorennen = new Autorennen()

  val rundenzeitenAuto1 = List(60.0, 55.0, 58.0, 57.5)
  println("Gesamtzeit für alle Runden: " + autorennen.gesamtzeitBerechnen(rundenzeitenAuto1))
  println("Durchschnittszeit pro Auto: " + autorennen.durchschnittszeitBerechnen(rundenzeitenAuto1))
}
