import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = BigInteger("0")

    val n = reader.readLine().toInt()
    for (i in 1..<n){
        answer = answer.add(BigInteger.valueOf((n + 1).toLong() * i))
    }

    writer.write("$answer")

    writer.flush()
    writer.close()
}