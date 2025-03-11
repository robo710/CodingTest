import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine()
    if (n == "0"){
        writer.write("0")
    }
    else {
        n.forEachIndexed { i, x ->
            when (x) {
                '1' -> if (i == 0) writer.write("1") else writer.write("001")
                '2' -> if (i == 0) writer.write("10") else writer.write("010")
                '3' -> if (i == 0) writer.write("11") else writer.write("011")
                '4' -> writer.write("100")
                '5' -> writer.write("101")
                '6' -> writer.write("110")
                '7' -> writer.write("111")
                else -> if (i == 0) writer.write("") else writer.write("000")
            }
        }
    }
    
    writer.flush()
    writer.close()
}