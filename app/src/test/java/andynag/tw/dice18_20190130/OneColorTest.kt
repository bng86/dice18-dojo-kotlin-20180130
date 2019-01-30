package andynag.tw.dice18_20190130

import org.junit.Assert
import org.junit.Test

class OneColorTest {

    @Test
    fun test_dice_is_all_same() {
        val inputDiceAllOne = "[1,1,1,1]"
        val expectIntArrayAllOne = listOf(1, 1, 1, 1)
//        val dices:List<Dice> = listOf()
            //TODO: Many dice)
        // convert one to array
        val actualList:List<Int> = Bowl().stringToIntArray(inputDiceAllOne)

        Assert.assertEquals(expectIntArrayAllOne,actualList)

    }



}