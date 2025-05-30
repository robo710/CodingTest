class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        for (i in my_string.indices){
        if(my_string[i] == 'a' || my_string[i] == 'e' || my_string[i] == 'i' || 
                my_string[i] == 'o' || my_string[i] == 'u') {
        } else {
            answer += my_string[i]
        }
    }
        return answer
    }
}