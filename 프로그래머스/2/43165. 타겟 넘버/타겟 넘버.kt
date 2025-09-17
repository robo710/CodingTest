class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0

        fun bfs(numbers: IntArray, index: Int, sum: Int, target: Int){
            if (index == numbers.size) {
                if (sum == target) {
                    answer++
                }
                return
            }

            bfs(numbers, index+1, sum + numbers[index], target)
            bfs(numbers, index+1, sum - numbers[index], target)
        }

        bfs(numbers, 0, 0, target)

        return answer
    }
}