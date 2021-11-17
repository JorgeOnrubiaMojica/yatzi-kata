class Yatzy {

    fun getScore(roll: List<Int>, category: String): Int
    {
        if (category == "chance"){
            return roll.sum()
        }
        return 0
    }
}