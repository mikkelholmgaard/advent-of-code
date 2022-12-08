import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer

object Day03 {
    def main(args: Array[String]) = {
        var input = readLine
        var a = "abcdefghijklmnopqrstuvwxyz";
        var aa = a + a.toUpperCase()
        var priority = 0

        while (input != null) {
            if (input != "") {
                var arr = input.splitAt(input.length/2)
                var set1 = arr._1.toSet
                var set2 = arr._2.toSet
                var set3 = set1.intersect(set2)
                priority += aa.indexOf(set3.head)+1
            }
            input = readLine
        }

        println(priority)
    }
}
