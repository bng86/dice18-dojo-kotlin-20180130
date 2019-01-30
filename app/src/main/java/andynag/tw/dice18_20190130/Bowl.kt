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
            val groupSize1 = group[0]!!.size
            val groupSize2 = group[1]!!.size
            if(groupSize1 == 2 && groupSize2 == 2){
                var hasNumberSix = group[0]!!.any { it.value == 6 }
                if(hasNumberSix){
                    return group[1]!!.any { it.value != 6 }

                }
            }
        }

        return false
    }

}
