class Solution {
    fun solution(a: Int, b: Int): Int {
        val ab: Int = (a.toString() + b.toString()).toInt()
        val ba: Int = (b.toString() + a.toString()).toInt()
        return if (ab > ba) ab else ba
    }
}