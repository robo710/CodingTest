class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        for (i in s.indices) {
            val c = s[i]
            when {
                c.isLowerCase() -> {
                    answer += ((c + n - 'a') % 26 + 'a'.code).toChar()
                }
                c.isUpperCase() -> {
                    answer += ((c + n - 'A') % 26 + 'A'.code).toChar()
                }
                else -> {
                    answer += c
                }
            }
        }
        return answer
    }
}