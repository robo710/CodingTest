class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        when{
            arr.size % 2 == 0 -> for (i in 1..<arr.size step 2){
                arr[i] += n
            }
            else -> for (i in 0..<arr.size step 2){
                arr[i] += n
            }
        }
        return arr
    }
}