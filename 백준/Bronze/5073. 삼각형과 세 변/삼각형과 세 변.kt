import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val (a, b, c) = reader.readLine().split(" ").map { it.toInt() }
        if (a == 0 && b == 0 && c == 0){
            break
        }
        if ((a + b + c) - maxOf(a, b, c) * 2 <= 0) {
            writer.write("Invalid\n")
        }
        else {
            when {
                a == b && b == c -> writer.write("Equilateral\n")
                a == b || b == c || c == a -> writer.write("Isosceles\n")
                else -> writer.write("Scalene\n")
            }
        }
    }

    writer.flush()
    writer.close()
}