package andynag.tw.dice18_20190130

import org.junit.Assert
import org.junit.Test

class OneColorTest {

    @Test
    fun test_dice_string_to_intArray_success() {
        val input_dice_all_one: String = "[1,1,1,1]"
        val expect_intArray_all_one = listOf(1, 1, 1, 1)
        // convert one to array
        val actualList:List<Int> = ConvertArray.stringToIntArray(input_dice_all_one)

        Assert.assertEquals(expect_intArray_all_one,actualList)

    }

}