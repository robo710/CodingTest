class Solution {
    fun solution(n: Long): IntArray {
        return n.toString().chunked(1).map { it.toInt() }.toIntArray().reversedArray()
    }
}