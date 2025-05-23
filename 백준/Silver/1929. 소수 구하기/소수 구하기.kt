import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (m, n) = reader.readLine().split(" ").map { it.toInt() }

    val isPrime = BooleanArray(n+1) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..n) {
        for (j in i * 2..n step i) {
            isPrime[j] = false
        }
    }

    for (i in m..n){
        if (isPrime[i]){
            writer.write("$i\n")
        }
    }

    writer.flush()
    writer.close()
}