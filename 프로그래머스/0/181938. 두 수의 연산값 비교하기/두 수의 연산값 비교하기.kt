class Solution {
    fun solution(a: Int, b: Int): Int {
        return if((a.toString() + b.toString()).toInt() < 2 * a * b){
            2 * a * b
        } else{
            (a.toString() + b.toString()).toInt()
        }
    }
}