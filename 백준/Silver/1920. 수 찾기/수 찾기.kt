import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val na = reader.readLine().split(" ").map { it.toInt() }.toSet()

    val m = reader.readLine().toInt()
    val ma = reader.readLine().split(" ").map { it.toInt() }

    ma.forEach{ i ->
        if (na.contains(i)){
            writer.write("1\n")
        } else {
            writer.write("0\n")
        }
    }

    writer.flush()
    writer.close()
}