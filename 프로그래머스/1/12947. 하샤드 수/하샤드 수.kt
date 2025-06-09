class Solution {
    fun solution(x: Int): Boolean {
        return x % x.toString().chunked(1).sumOf { it.toInt() } == 0
    }
}