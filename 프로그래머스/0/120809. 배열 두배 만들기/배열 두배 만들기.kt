class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = IntArray(numbers.size)
        var j = 0
        for (i in numbers){
            println(i)
            answer[j] = i * 2
            j++
        }
        return answer
    }
}