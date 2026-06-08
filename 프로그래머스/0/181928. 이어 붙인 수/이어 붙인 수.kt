class Solution {
    fun solution(num_list: IntArray): Int {
        var odd = ""
        var even = ""
        for (i in num_list){
            when{
                i % 2 == 0 -> even += i
                else -> odd += i
            }
        }
        return odd.toInt() + even.toInt()
    }
}