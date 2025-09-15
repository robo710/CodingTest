import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    var dia = 0 // 줄의 합
    var place = 0 // 현재 칸

    while (place < n) {
        dia++
        place += dia
    }

    val pos = dia - (place - n)

    val result = if(dia % 2 == 0) {
        "${pos}/${dia - pos + 1}"
    } else {
        "${dia - pos + 1}/${pos}"
    }
    
    writer.write(result)

    writer.flush()
    writer.close()
}