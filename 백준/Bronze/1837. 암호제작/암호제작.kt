import java.io.*
import java.math.BigInteger

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (pqStr, kStr) = reader.readLine().split(" ")
    val pq = BigInteger(pqStr)
    val k = kStr.toInt()
    var answer = 0

    val isPrime = BooleanArray(k) { true }
    isPrime[0] = false
    if (k > 1) isPrime[1] = false

    for (i in 2..<k) {
        if (isPrime[i]) {
            val bi = BigInteger.valueOf(i.toLong())
            if (pq.mod(bi) == BigInteger.ZERO) {
                answer = i
                break
            }
            for (j in i * 2..<k step i) {
                isPrime[j] = false
            }
        }
    }

    if (answer == 0) {
        writer.write("GOOD")
    } else {
        writer.write("BAD $answer")
    }

    writer.flush()
    writer.close()
}
