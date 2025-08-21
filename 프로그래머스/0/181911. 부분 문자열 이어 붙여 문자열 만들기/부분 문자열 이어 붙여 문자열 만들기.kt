class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        for (i in parts.indices) {
            val start = parts[i][0]
            val end = parts[i][1]
            answer += my_strings[i].substring(start, end + 1)
        }
        return answer
    }
}