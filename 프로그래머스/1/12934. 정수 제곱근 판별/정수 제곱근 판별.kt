import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        answer = sqrt(n.toDouble()).toLong()
        if (answer * answer == n) {
            return (answer + 1) * (answer + 1)
        }
        else {
            return -1
        }
    }
}