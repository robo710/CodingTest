class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var mul: Int = 1
        val sum: Int = num_list.sum() * num_list.sum()
        for(i in num_list.indices){
            mul *= num_list[i]
        }
        if (mul < sum){
            answer = 1
        } else {
            answer = 0
        }
        return answer
    }
}