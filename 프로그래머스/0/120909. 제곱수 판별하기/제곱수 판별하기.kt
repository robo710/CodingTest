class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 2
        for(i in 1..n){
            if(i * i == n){
                answer = 1
                break
            }
        }
        return answer
    }
}