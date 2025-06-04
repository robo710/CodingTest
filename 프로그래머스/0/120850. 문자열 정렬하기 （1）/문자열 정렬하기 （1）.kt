class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in 1..my_string.length){
            when(my_string[i-1]) {
                '0' -> answer = answer.plus(0)
                '1' -> answer = answer.plus(1)
                '2' -> answer = answer.plus(2)
                '3' -> answer = answer.plus(3)
                '4' -> answer = answer.plus(4)
                '5' -> answer = answer.plus(5)
                '6' -> answer = answer.plus(6)
                '7' -> answer = answer.plus(7)
                '8' -> answer = answer.plus(8)
                '9' -> answer = answer.plus(9)
            }
        }
        answer.sort()
        return answer
    }
}