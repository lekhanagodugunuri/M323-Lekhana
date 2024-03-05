class Reise {
  var route: List[String] = List()

  def destinationHinzufuegen(destination: String): Unit = {
    route = route :+ destination
  }

  def routeAendern(neueRoute: List[String]): Unit = {
    route = neueRoute
  }
}

object Beispiel1Main extends App {
  val reisePlaner = new Reise()


  reisePlaner.destinationHinzufuegen("Paris")
  reisePlaner.destinationHinzufuegen("Rom")
  println("Aktuelle Route: " + reisePlaner.route)

  reisePlaner.routeAendern(List("Madrid", "Berlin"))
  println("Geänderte Route: " + reisePlaner.route)
}
