import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toLong()
    val size = reader.readLine().split(" ").map { it.toLong() }
    val (t, p) = reader.readLine().split(" ").map { it.toLong() }

    var tBundle = 0L
    val pBundle = n / p
    val pEach = n % p

    size.forEach{ i ->
        tBundle += if (i % t != 0L) {
            (i / t) + 1
        } else {
            i / t
        }
    }

    writer.write("$tBundle\n")
    writer.write("$pBundle $pEach")

    writer.flush()
    writer.close()
}