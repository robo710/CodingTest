class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for (i in 0 until strArr.size) {
            if (!strArr[i].contains("ad")) {
                answer += strArr[i]
            }
        }
        return answer
    }
}