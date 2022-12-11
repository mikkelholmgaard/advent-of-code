import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer

object Day06 {
  def main(args: Array[String]) = {
    var input = readLine
    var markers: ListBuffer[Int] = new ListBuffer[Int]()

    while (input != null) {
      if (input != "") {
        var arr = input.toCharArray
        arr.zipWithIndex.map { (c, i) =>
          // First part
          if (i > 3) {
            var x = List(arr(i-3), arr(i-2), arr(i-1), arr(i))
            if (x.size == x.distinct.size) markers.addOne(i+1)
          }

          // Second part
//          if (i > 13) {
//            var x = List(arr(i - 13), arr(i - 12), arr(i - 11), arr(i - 10), arr(i - 9), arr(i - 8), arr(i - 7), arr(i - 6), arr(i - 5), arr(i - 4), arr(i - 3), arr(i - 2), arr(i - 1), arr(i))
//            if (x.size == x.distinct.size) markers.addOne(i+1)
//          }
        }
      }
      input = readLine
    }

    println(markers.toList.head)
  }
}
