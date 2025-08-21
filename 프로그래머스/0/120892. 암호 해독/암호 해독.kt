class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer: String = ""
        for (i in cipher.indices){
            if ((i + 1) % code == 0) {
                answer += cipher[i]
            }
        }
        return answer
    }
}