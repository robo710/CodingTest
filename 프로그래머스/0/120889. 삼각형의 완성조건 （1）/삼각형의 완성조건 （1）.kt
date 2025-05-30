class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 2
        sides.sort()
        if(sides[0] + sides[1] > sides[2]){
            answer = 1
        }
        return answer
    }
}