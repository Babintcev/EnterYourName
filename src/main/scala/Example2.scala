import scala.io.StdIn.readLine

object Example2 {
  def main(args: Array[String]): Unit = {
    println("Hello. Enter line here:")
    val line = readLine()
    print("You entered: ")
    println(line)
  }
}
