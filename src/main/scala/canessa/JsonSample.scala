package canessa

import net.liftweb.json.DefaultFormats
import net.liftweb.json._

case class Languages(languages: List[Language])
case class Language(name: String, is_active: Boolean, completeness: Double)

object JsonSample extends App {

  implicit val formats = DefaultFormats

  val jsonString ="""
    {
        "languages": [{
            "name": "English",
            "is_active": true,
            "completeness": 2.5
        }, {
            "name": "Latin",
            "is_active": false,
            "completeness": 0.9
        }]
      }
    """
  val json = parse(jsonString).extract[Languages]
  json.languages.map(x =>
    println(x.name, x.is_active, x.completeness, "hi")
  )
}
