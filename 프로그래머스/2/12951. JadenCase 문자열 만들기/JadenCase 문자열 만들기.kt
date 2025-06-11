class Solution {
    fun solution(s: String): String {
        return s.split(" ").map { it.lowercase().replaceFirstChar { c -> c.uppercase() } }.joinToString (" ")
    }
}