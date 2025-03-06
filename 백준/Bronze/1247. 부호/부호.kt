import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val sumArray = Array(3) { "" }

    for (i in 0..2) {
        val n = reader.readLine().toInt()
        var sum = BigInteger.ZERO

        for (j in 1..n) {
            val m = reader.readLine().toBigInteger()
            sum += m
        }

        sumArray[i] = when {
            sum > BigInteger.ZERO -> "+"
            sum < BigInteger.ZERO -> "-"
            else -> "0"
        }
    }

    sumArray.forEach { println(it) }
}