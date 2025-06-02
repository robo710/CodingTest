class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        var health = hp
        answer += health / 5
        health %= 5
        answer += health / 3
        health %= 3
        answer += health / 1

        return answer
    }
}