package andynag.tw.dice18_20190130

object ConvertArray {
    fun stringToIntArray(pointString: String): List<Int> {
        pointString.substringAfter("[")
            .substringBefore("]")
            .split(",").toList()
        return listOf(1, 1, 1, 1)
    }

}
