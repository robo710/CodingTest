class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        var answer: Int = 0
        for (i in num_list){
            if(i == n){
                answer = 1
                break
            }
        }
        return answer
    }
}