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

        var sortedList = list.sortWith(_ > _)

        println(sortedList(0))
        println(sortedList(0) + sortedList(1) + sortedList(2))
    }
}