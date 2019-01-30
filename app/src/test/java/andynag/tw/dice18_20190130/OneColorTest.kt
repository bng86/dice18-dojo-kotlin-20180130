package andynag.tw.dice18_20190130

import org.junit.Assert
import org.junit.Test

class OneColorTest {

    @Test
    fun test_one_color() {
        val one = "[1,1,1,1]"
        val oneArr = listOf(1, 1, 1, 1)
        // convert one to array
        val converted:List<Int> = TranseArray.convertToArray(one)
        Assert.assertEquals(oneArr,converted)

    }


}