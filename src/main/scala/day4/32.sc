import play.api.libs.json.{JsValue, Json}

val json =
  """
    |{
    |    "item": {
    |        "title": "title1 [BM]",
    |        "name": "name1 [BM]",
    |        "parts": [
    |            {
    |                "description": "good[BM] part [BM]",
    |                "bookmarks": ["one", "two", "abc", "xyz"],
    |                "part": {
    |                    "innerA": "Inner1[BM] bookmark",
    |                    "innerB": "Inner2[BM] bookmark"
    |                },
    |                "instruction": "good part [BM]"
    |            }
    |        ],
    |        "bookmarks": ["titleBM", "nameBM"]
    |    }
    |}
  """.stripMargin

Json.parse("json").as[JsValue]

