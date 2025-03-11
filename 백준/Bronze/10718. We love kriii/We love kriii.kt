import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    writer.write("강한친구 대한육군\n")
    writer.write("강한친구 대한육군")

    writer.flush()
    writer.close()
}