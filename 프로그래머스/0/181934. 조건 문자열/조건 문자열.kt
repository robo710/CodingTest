class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        val isTrue = when (ineq + eq) {
            ">=" -> n >= m
            "<=" -> n <= m
            ">!" -> n > m
            "<!" -> n < m
            else -> false
        }

        return if (isTrue) 1 else 0
    }
}