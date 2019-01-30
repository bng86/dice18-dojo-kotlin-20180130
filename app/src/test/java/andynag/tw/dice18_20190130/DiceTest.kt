package andynag.tw.dice18_20190130

import org.junit.Assert
import org.junit.Test

class DiceTest{
    @Test
    fun test_dice(){
        val input = 1
        val expected = Dice(1).value

        Assert.assertEquals(expected , input)
    }
}