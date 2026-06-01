class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        var i = 0
        while (i < my_string.length){
            if(i != s) {
                answer += my_string[i]
                i++
            } else {
                answer += overwrite_string
                i += overwrite_string.length
            }
        }
        return answer
    }
}