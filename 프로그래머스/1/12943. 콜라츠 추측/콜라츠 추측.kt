class Solution {
    fun solution(num: Int): Int {
        var answer = num
        for (i in 1..500) {
            when {
                i == 500 && answer != 1 -> return -1
                answer == 1 -> return i - 1
                answer % 2 == 0 -> answer /= 2
                answer % 2 == 1 -> answer = answer * 3 + 1
            }
        }
        return answer
    }
}