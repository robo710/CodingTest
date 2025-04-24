import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0
    val s = reader.readLine()
    var i = 0
    while (i < s.length){
        if (i + 1 < s.length) {
            i += when {
                s[i] == 'c' && (s[i + 1] == '=' || s[i + 1] == '-') -> 2
                s[i] == 'd' && s[i + 1] == '-' -> 2
                i + 2 < s.length && s[i] == 'd' && s[i + 1] == 'z' && s[i + 2] == '=' -> 3
                s[i] == 'l' && s[i + 1] == 'j' -> 2
                s[i] == 'n' && s[i + 1] == 'j' -> 2
                s[i] == 's' && s[i + 1] == '=' -> 2
                s[i] == 'z' && s[i + 1] == '=' -> 2
                else -> {
                    1
                }
            }
        } else {
            i += 1
        }
        answer++
    }

    writer.write("$answer")

    writer.flush()
    writer.close()
}