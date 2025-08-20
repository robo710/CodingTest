class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var pre = 0
        var current = 1
        when (n) {
            0 -> {
                return 0
            }
            1 -> {
                return 1
            }
            else -> {
                for (i in 2..n){
                    answer = (pre + current) % 1234567
                    pre = current
                    current = answer
                }
            }
        }
        return answer
    }
}