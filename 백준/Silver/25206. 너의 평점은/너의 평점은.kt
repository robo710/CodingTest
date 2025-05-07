import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var sum = 0.0
    var total = 0.0

    for (i in 0..19){
        val sub = reader.readLine().split(" ")
        total += sub[1].toFloat()
        when(sub[2]){
            "A+" -> sum += sub[1].toFloat() * 4.5
            "A0" -> sum += sub[1].toFloat() * 4.0
            "B+" -> sum += sub[1].toFloat() * 3.5
            "B0" -> sum += sub[1].toFloat() * 3.0
            "C+" -> sum += sub[1].toFloat() * 2.5
            "C0" ->	sum += sub[1].toFloat() * 2.0
            "D+" ->	sum += sub[1].toFloat() * 1.5
            "D0" ->	sum += sub[1].toFloat() * 1.0
            "F"	 -> sum += sub[1].toFloat() * 0.0
            else -> total -= sub[1].toFloat()
        }
    }
    writer.write("${sum / total}")

    writer.flush()
    writer.close()
}