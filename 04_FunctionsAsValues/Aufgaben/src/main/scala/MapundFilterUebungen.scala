object MapundFilterUebungen {

  def main(args: Array[String]): Unit = {
    println(filteredMitarbeiter)
    println(filteredSortedKurse)
  }

  case class Mitarbeiter(name: String, abteilung: String, gehalt: Int)

  val mitarbeiter = List(
    Mitarbeiter("Max Mustermann", "IT", 50000),
    Mitarbeiter("Erika Musterfrau", "Marketing", 45000),
    Mitarbeiter("Klaus Klein", "IT", 55000),
    Mitarbeiter("Julia Gross", "HR", 40000)
  )

  val kurse = List(
    "Programmierung in Scala",
    "Datenbanken",
    "Webentwicklung mit JavaScript",
    "Algorithmen und Datenstrukturen"
  )

  def filterUndTransformiereMitarbeiter(mitarbeiterListe: List[Mitarbeiter]): List[String] = {
    mitarbeiterListe.filter(mitarbeiter => mitarbeiter.abteilung == "IT" && mitarbeiter.gehalt >= 50000)
      .map(mitarbeiter => mitarbeiter.name.split(" ").head.toUpperCase)
  }

  def filterSortiereKurse(kursListe: List[String]): List[String] = {
    val filteredKurse = kursListe.filter(kurs => kurs.contains("Daten"))
    val ohneLeerzeichen = filteredKurse.map(kurs => kurs.replaceAll(" ", ""))
    val aufsteigendSortiert = ohneLeerzeichen.sorted
    val absteigendSortiert = aufsteigendSortiert.sorted(Ordering[String].reverse)
    absteigendSortiert
  }

  // Übung 1: Filterung von Mitarbeiterdaten
  val filteredMitarbeiter = filterUndTransformiereMitarbeiter(mitarbeiter)


  // Übung 2: Kursnamen formatieren und sortieren
  val filteredSortedKurse = filterSortiereKurse(kurse)



}
