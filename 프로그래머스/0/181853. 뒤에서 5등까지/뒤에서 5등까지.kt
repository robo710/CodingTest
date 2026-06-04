class Solution {
    fun solution(num_list: IntArray): IntArray = num_list.sortedArray().sliceArray(0..4)
}