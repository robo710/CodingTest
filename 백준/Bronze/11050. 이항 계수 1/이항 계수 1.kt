import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = reader.readLine().split(" ").map { it.toInt() }
    var n1 = 1
    var k1 = 1
    var nk = 1

    for (i in 1..n){
        n1 *= i
    }

    for (i in 1..k){
        k1 *= i
    }

    for (i in 1..(n-k)){
        nk *= i
    }

    val answer = n1 / (k1 * nk)

    writer.write("$answer")

    writer.flush()
    writer.close()
}