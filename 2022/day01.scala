import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer

object Day01 {
    def main(args: Array[String]) = {
        var input: String = readLine
        var curr: Int = 0
        var list: ListBuffer[Int] = new ListBuffer[Int]()

        while (input != null) {
            if (input != "") {
                curr += input.toInt
            } else {
                list += curr
                curr = 0
            }
            input = readLine
        }

        list = list.sortWith(_ > _)

        println(list(0))
        println(list(0) + list(1) + list(2))
    }
}