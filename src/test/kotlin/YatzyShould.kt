import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class YatzyShould {

    @Test
    fun `return the sum of the rolls when category is chance`(){
        val yatzy = Yatzy()
        assertEquals(14, yatzy.getScore(listOf(1,1,3,3,6) ,"chance"))
        assertEquals(21, yatzy.getScore(listOf(4,5,5,6,1) ,"chance"))
        assertEquals(5, yatzy.getScore(listOf(1,1,1,1,1), "chance"))
    }
}