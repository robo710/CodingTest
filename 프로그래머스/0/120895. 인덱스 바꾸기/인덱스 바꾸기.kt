class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer = my_string.toCharArray()
        answer[num1] = my_string[num2]
        answer[num2] = my_string[num1]
        return answer.joinToString("")
    }
}