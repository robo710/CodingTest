import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val n = reader.readLine().toLong()
    for (i in 1..n){
        val a = reader.readLine()!!.split(" ").map { it.toLong() }
        when(a[0] % 10){
            1L -> println(1L)
            2L -> {
                when(a[1] % 4){
                    1L -> println(2L)
                    2L -> println(4L)
                    3L -> println(8L)
                    0L -> println(6L)
                }
            }
            3L -> {
                when(a[1] % 4){
                    1L -> println(3L)
                    2L -> println(9L)
                    3L -> println(7L)
                    0L -> println(1L)
                }
            }
            4L -> {
                when(a[1] % 2){
                    1L -> println(4L)
                    0L -> println(6L)
                }
            }
            5L -> println(5L)
            6L -> println(6L)
            7L -> {
                when(a[1] % 4){
                    1L -> println(7L)
                    2L -> println(9L)
                    3L -> println(3L)
                    0L -> println(1L)
                }
            }
            8L -> {
                when(a[1] % 4){
                    1L -> println(8L)
                    2L -> println(4L)
                    3L -> println(2L)
                    0L -> println(6L)
                }
            }
            9L -> {
                when(a[1] % 2){
                    1L -> println(9L)
                    0L -> println(1L)
                }
            }
            0L -> println(10L)
        }
    }
}
