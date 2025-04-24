import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.out))


    writer.write("         ,r'\"7\n" +
            "r`-_   ,'  ,/\n" +
            " \\. \". L_r'\n" +
            "   `~\\/\n" +
            "      |\n" +
            "      |")

    writer.flush()
    writer.close()
}