class Solution {
    fun solution(s: String): IntArray {
        var a = s
        var time = 1
        var len = 0
        var answer: IntArray = intArrayOf()
        while (a != "1") {
            len += a.length - a.replace("0", "").length
            a = a.replace("0", "")
            a = a.length.toString(2)
            answer = intArrayOf(time, len)
            time++
        }
        return answer
    }
}