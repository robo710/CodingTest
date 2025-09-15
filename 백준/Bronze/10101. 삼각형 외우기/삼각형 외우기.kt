import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val a = reader.readLine().toInt()
    val b = reader.readLine().toInt()
    val c = reader.readLine().toInt()

    if( a + b + c != 180) {
        writer.write("Error")
        writer.flush()
        writer.close()
        return
    }
    else {
        when {
            a == b && b == c -> writer.write("Equilateral")
            a == b || b == c || c == a -> writer.write("Isosceles")
            else -> writer.write("Scalene")
        }
    }

    writer.flush()
    writer.close()
}