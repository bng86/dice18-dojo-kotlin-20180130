package andynag.tw.dice18_20190130

class Bowl(val input : String) {
    fun getDices(): List<Dice> {
        return input.substringAfter("[")
            .substringBefore("]")
            .split(",").toList().map { Dice(it.toInt()) }
    }

    fun hasTwoSix(expectIntArray: List<Dice>): Boolean {
        return true
    }

}
