import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val i1 = reader.readLine()
    val i2 = reader.readLine()
    val i3 = reader.readLine()
    var answer = "0"

    when(i3){
        "Fizz" -> {
            when(i2){
                "Fizz" -> {
                    when(i1){
                        "Fizz" -> {}
                        "Buzz" -> {}
                        "FizzBuzz" -> {}
                        else -> answer = (i1.toInt() + 3).toString()
                    }
                }
                "Buzz" -> {
                    when(i1){
                        "Fizz" -> {}
                        "Buzz" -> {}
                        "FizzBuzz" -> {}
                        else -> answer = (i1.toInt() + 3).toString()
                    }
                }
                "FizzBuzz" -> {
                    when(i1){
                        "Fizz" -> {}
                        "Buzz" -> {}
                        "FizzBuzz" -> {}
                        else -> answer = (i1.toInt() + 3).toString()
                    }
                }
                else -> answer = (i2.toInt() + 2).toString()
            }
        }
        "Buzz" -> {
            when(i2){
                "Fizz" -> {
                    when(i1){
                        "Fizz" -> {}
                        "Buzz" -> {}
                        "FizzBuzz" -> {}
                        else -> answer = (i1.toInt() + 3).toString()
                    }
                }
                "Buzz" -> {
                    when(i1){
                        "Fizz" -> {}
                        "Buzz" -> {}
                        "FizzBuzz" -> {}
                        else -> answer = (i1.toInt() + 3).toString()
                    }
                }
                "FizzBuzz" -> {
                    when(i1){
                        "Fizz" -> {}
                        "Buzz" -> {}
                        "FizzBuzz" -> {}
                        else -> answer = (i1.toInt() + 3).toString()
                    }
                }
                else -> answer = (i2.toInt() + 2).toString()
            }
        }
        "FizzBuzz" -> {
            when(i2){
                "Fizz" -> {
                    when(i1){
                        "Fizz" -> {}
                        "Buzz" -> {}
                        "FizzBuzz" -> {}
                        else -> answer = (i1.toInt() + 3).toString()
                    }
                }
                "Buzz" -> {
                    when(i1){
                        "Fizz" -> {}
                        "Buzz" -> {}
                        "FizzBuzz" -> {}
                        else -> answer = (i1.toInt() + 3).toString()
                    }
                }
                "FizzBuzz" -> {
                    when(i1){
                        "Fizz" -> {}
                        "Buzz" -> {}
                        "FizzBuzz" -> {}
                        else -> answer = (i1.toInt() + 3).toString()
                    }
                }
                else -> answer = (i2.toInt() + 2).toString()
            }
        }
        else -> answer = (i3.toInt() + 1).toString()
    }

    when {
        answer.toInt() % 3 == 0 && answer.toInt() % 5 == 0 -> answer = "FizzBuzz"
        answer.toInt() % 3 == 0 -> answer = "Fizz"
        answer.toInt() % 5 == 0 -> answer = "Buzz"
    }
    writer.write(answer)

    writer.flush()
    writer.close()
}