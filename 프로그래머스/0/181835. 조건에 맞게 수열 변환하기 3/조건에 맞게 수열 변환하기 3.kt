class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        answer = when{
            k % 2 == 0 -> arr.map { it + k }.toIntArray()
            else -> arr.map { it * k }.toIntArray()
        }
        return answer
    }
}