object OptionUebung {

  case class TvShow(title: String, start: Int, end: Int)

  def main(args: Array[String]): Unit = {
    val rawShowCorrect = "Mad Men (2007-2015)"
    val rawShowIncorrect = "Mad Men (-2015)"

    println(parseShow(rawShowCorrect))
    println(parseShow(rawShowIncorrect))
  }

  def parseShow(rawShow: String): Option[TvShow] = {
    for {
      name      <- extractName(rawShow)
      yearStart <- extractYearStart(rawShow)
      yearEnd   <- extractYearEnd(rawShow)
    } yield TvShow(name, yearStart, yearEnd)
  }

  def extractName(rawShow: String): Option[String] = {
    val bracketOpen = rawShow.indexOf('(')
    if (bracketOpen != -1) Some(rawShow.substring(0, bracketOpen).trim) else None
  }

  def extractYearStart(rawShow: String): Option[Int] = {
    val bracketOpen = rawShow.indexOf('(')
    val dash        = rawShow.indexOf('-')
    val yearStrOpt  =
      if (bracketOpen != -1 && dash > bracketOpen + 1) Some(rawShow.substring(bracketOpen + 1, dash)) else None
    yearStrOpt.map(yearStr => yearStr.toIntOption).flatten
  }

  def extractYearEnd(rawShow: String): Option[Int] = {
    val dash         = rawShow.indexOf('-')
    val bracketClose = rawShow.indexOf(')')
    val yearStrOpt   =
      if (dash != -1 && bracketClose > dash + 1) Some(rawShow.substring(dash + 1, bracketClose)) else None
    yearStrOpt.map(yearStr => yearStr.toIntOption).flatten
  }
}
