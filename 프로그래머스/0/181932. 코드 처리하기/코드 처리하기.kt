class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Boolean = false
        val a = code.chunked(1)
        for(i in 0 until a.size) {
            when{
                a[i] == "1" -> {
                    mode = !mode
                    continue
                }
            }
            when{
                mode -> if (i % 2 == 1){
                    answer += a[i]
                }
                else -> if (i % 2 == 0){
                    answer += a[i]
                }
            }
        }
        when(answer){
            "" -> return "EMPTY"
            else -> return answer
        }
    }
}