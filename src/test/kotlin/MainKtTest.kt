import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun should_ReturnCorrectPercentage_When_AllStringsInArrayCorrect() {
        // given an array of only a,b strings
        val arrayOfStringToCheck: Array<String?> = arrayOf("a", "b", "b")
        // when check array of strings
        val resultOfCheck = checkString(arrayOfStringToCheck)
        // then
        assertEquals(33.3,resultOfCheck)
    }

    @Test
    fun should_ReturnIncorrect_When_ArrayHaveStringOf_a_LongerThanOneCharacter() {
        // given an array have string of a longer than one character
        val arrayOfStringToCheck: Array<String?> = arrayOf("aa", "b", "b")
        // when check array of strings
        val resultOfCheck = checkString(arrayOfStringToCheck)
        // then
        assertEquals(-1.0,resultOfCheck)
    }

    @Test
    fun should_ReturnIncorrect_When_ArrayHaveStringOf_b_LongerThanOneCharacter() {
        // given an array have string of b longer than one character
        val arrayOfStringToCheck: Array<String?> = arrayOf("a", "bbb", "b")
        // when check array of strings
        val resultOfCheck = checkString(arrayOfStringToCheck)
        // then
        assertEquals(-1.0,resultOfCheck)
    }

    @Test
    fun should_ReturnIncorrect_When_ArrayHaveStringOfNullCharacter() {
        // given an array have string of null character
        val arrayOfStringToCheck: Array<String?> = arrayOf("a", "b", null)
        // when check array of strings
        val resultOfCheck = checkString(arrayOfStringToCheck)
        // then
        assertEquals(-1.0,resultOfCheck)
    }

    @Test
    fun should_ReturnIncorrect_When_ArrayHaveStringOfIncorrectCharacter(){
        // given an array have string of incorrect character
        val arrayOfStringToCheck: Array<String?> = arrayOf("a", "b", "p")
        // when check array of strings
        val resultOfCheck = checkString(arrayOfStringToCheck)
        // then
        assertEquals(-1.0,resultOfCheck)
    }
}