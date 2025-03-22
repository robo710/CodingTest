import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val a = BigInteger(reader.readLine()) // BigInteger 사용
    val b = BigInteger(reader.readLine())

    writer.write("${a + b}\n") // 덧셈
    writer.write("${a - b}\n") // 뺄셈
    writer.write("${a * b}\n") // 곱셈

    writer.flush()
    writer.close()
}
