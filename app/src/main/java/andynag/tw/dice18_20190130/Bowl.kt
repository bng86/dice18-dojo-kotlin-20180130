package andynag.tw.dice18_20190130

class Bowl(val input : String) {
    fun getDices(): List<Dice> {
        return input.substringAfter("[")
            .substringBefore("]")
            .split(",").toList().map { Dice(it.toInt()) }
    }

    fun isSepatla(): Boolean {
        val group = getDices().groupBy {
            it.value
        }

        if(group.size == 2){
            group[0]!!.size

        }

        return true
    }

}
