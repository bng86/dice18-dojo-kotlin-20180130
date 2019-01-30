package andynag.tw.dice18_20190130

import org.junit.Assert
import org.junit.Test

class OneColorTest {

    @Test
    fun test_dice_is_all_same() {
        val inputDiceAllOne = "[1,1,1,1]"
        val expectIntArrayAllOne = listOf(
            Dice(1), Dice(1), Dice(1), Dice(1))
//        val dices:List<Dice> = listOf()
        val actualList:List<Dice> = Bowl(inputDiceAllOne).getDices()

        Assert.assertEquals(expectIntArrayAllOne,actualList)
    }

    @Test
    fun test_dice_have_18la() {
        val inputDiceAllOne = "[1,1,2,3]"
        val expectIntArray = listOf(
            Dice(1), Dice(1), Dice(6), Dice(6))

    }
}