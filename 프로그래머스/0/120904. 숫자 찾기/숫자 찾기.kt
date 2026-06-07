class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer = num.toString().indexOf(k.toString())
        when{
            answer >= 0 -> answer += 1
        }
        return answer
    }
}