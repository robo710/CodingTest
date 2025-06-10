class Solution {
    fun solution(s: String): Int {
        var answer: String = ""
        var i = 0
        while (i < s.length) {
            when {
                s[i] == 'z' -> {
                    answer += "0"
                    i += 4
                }
                s[i] == 'o' -> {
                    answer += "1"
                    i += 3
                }
                s[i] == 't' && s[i+1] == 'w' -> {
                    answer += "2"
                    i += 3
                }
                s[i] == 't' && s[i+1] == 'h' -> {
                    answer += "3"
                    i += 5
                }
                s[i] == 'f' && s[i+1] == 'o' -> {
                    answer += "4"
                    i += 4
                }
                s[i] == 'f' && s[i+1] == 'i' -> {
                    answer += "5"
                    i += 4
                }
                s[i] == 's' && s[i+1] == 'i' -> {
                    answer += "6"
                    i += 3
                }
                s[i] == 's' && s[i+1] == 'e' -> {
                    answer += "7"
                    i += 5
                }
                s[i] == 'e' -> {
                    answer += "8"
                    i += 5
                }
                s[i] == 'n' -> {
                    answer += "9"
                    i += 4
                }
                else -> {
                    answer += s[i]
                    i += 1
                }
            }
        }
        return answer.toInt()
    }
}