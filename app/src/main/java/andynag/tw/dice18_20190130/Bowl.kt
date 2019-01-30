package andynag.tw.dice18_20190130

class Bowl() {
    fun stringToIntArray(pointString: String): List<Int> {
        return pointString.substringAfter("[")
            .substringBefore("]")
            .split(",").toList().map { it.toInt() }
    }

}
