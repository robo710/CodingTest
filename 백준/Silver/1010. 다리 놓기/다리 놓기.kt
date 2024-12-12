import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val a = ArrayList<Long>()
    var r:Long

    for(i in 0..<n){
        val st = StringTokenizer(reader.readLine())
        while(st.hasMoreTokens()){
            a.add(st.nextToken().toLong())
        }
        if ((a[1] - a[0]) < a[0]){
            r = factorial(a[1], a[1] - a[0]) / (factorial(a[1] - a[0], a[1] - a[0]))
        }
        else {
            r = factorial(a[1], a[0]) / (factorial(a[0], a[0]))
        }
        if (r == 0L){
            writer.write("1")
            writer.newLine()
        }
        else {
            writer.write(r.toString())
            writer.newLine()
        }
        a.clear()
    }

    writer.flush()
    writer.close()
}

fun factorial(n:Long, re:Long):Long{
    return if(re > 0) {
        n * factorial(n - 1, re - 1)
    }
    else 1
}