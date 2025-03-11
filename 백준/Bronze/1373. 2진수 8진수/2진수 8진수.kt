import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().reversed().chunked(3).map { it.reversed() }.reversed()

    if (n[0] == "0"){
        writer.write("0")
    }
    else {
        n.forEach {x ->
            when (x) {
                "001", "1" -> writer.write("1")
                "010", "10" -> writer.write("2")
                "011", "11" -> writer.write("3")
                "100" -> writer.write("4")
                "101" -> writer.write("5")
                "110" -> writer.write("6")
                "111" -> writer.write("7")
                "000" -> writer.write("0")
            }
        }
    }

    writer.flush()
    writer.close()
}