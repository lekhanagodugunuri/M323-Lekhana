object DatenStrukturMap {
  def main(args: Array[String]): Unit = {
    // Übung
    val m1: Map[String, String] = Map("key" -> "value")
    println(s"Map m1: $m1")

    // Übung 2
    val m2: Map[String, String] = m1 + ("key2" -> "value2")
    println(s"Map m2: $m2")

    // Übung 3
    val m3: Map[String, String] = m2 + ("key2" -> "aDifferentValue")
    println(s"Map m3: $m3")

    // Übung 4
    val m4: Map[String, String] = m3 - "key"
    println(s"Map m4: $m4")

    // Übung 5
    val valueFromM3: Option[String] = m3.get("key")
    println(s"Wert von 'key' in m3: $valueFromM3")

    // Übung 6
    val valueFromM4: Option[String] = m4.get("key")
    println(s"Wert von 'key' in m4: $valueFromM4")
  }
}
