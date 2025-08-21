class Solution {
    fun solution(box: IntArray, n: Int): Int {
        var answer: Int = 1
        answer *= box[0] / n
        answer *= box[1] / n
        answer *= box[2] / n
        return answer
    }
}