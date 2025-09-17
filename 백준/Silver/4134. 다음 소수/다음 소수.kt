import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val t = reader.readLine().toInt()

    repeat(t) {
        var n = reader.readLine().toLong()
        while (!isPrime(n)) {
            n++
        }
        writer.write("$n\n")
    }

    writer.flush()
    writer.close()
}

fun isPrime(n: Long): Boolean {
    if (n < 2) return false
    for (i in 2..sqrt(n.toDouble()).toLong()){
        if (n % i == 0L) return false
    }
    return true
}