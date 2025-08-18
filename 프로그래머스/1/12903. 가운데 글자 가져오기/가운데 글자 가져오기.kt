class Solution {
    fun solution(s: String): String {
        var answer = ""
        if (s.length % 2 == 0) {
            answer = s.substring(s.length / 2 - 1, s.length / 2 + 1)
        } else {
            answer = s.substring(s.length / 2, s.length / 2 + 1)
        }
        return answer
    }
}