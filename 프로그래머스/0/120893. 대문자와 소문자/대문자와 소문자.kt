class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        my_string.forEach {
            when {
                it.isLowerCase() -> answer += it.uppercaseChar()
                it.isUpperCase() -> answer += it.lowercaseChar()
                else -> answer += it
            }
        }
        return answer
    }
}