class Solution {
    fun solution(num_str: String): Int {
        return num_str.chunked(1).sumOf { it.toInt() }
    }
}