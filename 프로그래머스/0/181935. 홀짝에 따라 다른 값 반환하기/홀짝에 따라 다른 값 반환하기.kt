class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        when(n % 2){
            0 -> {for (i in 0..n step 2){
                answer += (i * i)
            }}
            1 -> {for (i in 1..n step 2){
                answer += i
            }}
        }
        return answer
    }
}