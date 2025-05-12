import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    do {
        val (a, b, c) = reader.readLine().split(" ").map { it.toLong() }

        if (a == 0L && b == 0L && c == 0L){
            break
        }

        when{
            a > b && a > c -> {
                if (b * b + c * c == a * a){
                    writer.write("right\n")
                } else{
                    writer.write("wrong\n")
                }
            }
            b > a && b > c -> {
                if (a * a + c * c == b * b){
                    writer.write("right\n")
                } else{
                    writer.write("wrong\n")
                }
            }
            else -> {
                if (a * a + b * b == c * c){
                    writer.write("right\n")
                } else{
                    writer.write("wrong\n")
                }
            }
        }
    }while (true)

    writer.flush()
    writer.close()
}