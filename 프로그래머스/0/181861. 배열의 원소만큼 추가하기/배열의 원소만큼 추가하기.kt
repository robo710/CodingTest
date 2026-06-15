class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in arr){
            for (j in 0 until i){
                answer += i
            }
        }
        return answer
    }
}