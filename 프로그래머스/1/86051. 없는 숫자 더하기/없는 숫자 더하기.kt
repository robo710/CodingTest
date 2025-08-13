class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 45
        for (i in numbers){
            when (i) {
                0 -> answer -= 0
                1 -> answer -= 1
                2 -> answer -= 2
                3 -> answer -= 3
                4 -> answer -= 4
                5 -> answer -= 5
                6 -> answer -= 6
                7 -> answer -= 7
                8 -> answer -= 8
                9 -> answer -= 9
            }
        }
        return answer
    }
}