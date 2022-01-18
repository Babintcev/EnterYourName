import scala.io.StdIn.readLine

object EnterYourName {
  def main(args: Array[String]): Unit = {
    println("Hello. Enter your name here:")
    println("Hi, " + readLine() + "!")
  }
}
