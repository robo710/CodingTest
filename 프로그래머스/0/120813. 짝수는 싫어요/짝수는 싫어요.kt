class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in 1..n){
            if(i % 2 != 0){
                answer = answer.plus(i)
            }
        }
        return answer
    }
}