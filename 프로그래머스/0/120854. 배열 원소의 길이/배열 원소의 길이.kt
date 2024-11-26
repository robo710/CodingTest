class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in strlist){
            answer = answer.plus(i.length)
        }
        return answer
    }
}