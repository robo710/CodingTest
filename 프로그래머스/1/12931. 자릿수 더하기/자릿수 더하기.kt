class Solution {
    fun solution(n: Int): Int {
        return n.toString().chunked(1).sumOf { it.toInt() }
    }
}