class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var denom = lcm(denom1, denom2)
        var number: Int = 0
        number += (denom / denom1) *  numer1
        number += (denom / denom2) *  numer2
        answer += number / gcd(denom, number)
        answer += denom / gcd(denom, number)
        return answer
    }
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    fun lcm(a: Int, b: Int): Int {
        return a * b / gcd(a, b)
    }
}