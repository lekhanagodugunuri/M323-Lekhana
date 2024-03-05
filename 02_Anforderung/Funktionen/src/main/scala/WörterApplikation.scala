object WörterApplikation extends App {

  def punkteBerechnen(wort: String): Int = {
    wort.filterNot(_ == 'a').length
  }

  println("Geben Sie Wörter ein (Leerzeichen getrennt):")
  val eingabe = scala.io.StdIn.readLine()
  val woerter = eingabe.split(" ").toList

  val punkteMap = woerter.map(wort => (wort, punkteBerechnen(wort)))

  val sortierteListe = punkteMap.sortBy(-_._2)

  println("Liste sortiert nach Punktzahl:")
  sortierteListe.foreach { case (wort, punkte) =>
    println(s"$wort - $punkte Punkte")
  }
}
