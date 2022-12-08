import scala.io.StdIn.readLine

object Day03 {
  def main(args: Array[String]) = {
    var input = readLine
    var i = 0

    // Second part
    while (input != null) {
      if (input != "") {
        var sections = input.split(",").map(_.split("-"))
        var x1 = sections(0)(0).toInt
        var x2 = sections(0)(1).toInt
        var x = (x1 to x2 by 1).toSet

        var y1 = sections(1)(0).toInt
        var y2 = sections(1)(1).toInt
        var y = (y1 to y2 by 1).toSet

        if (!x.intersect(y).isEmpty) i+=1
      }
      input = readLine
    }

    // First part
//    def fOverlap(a1: Int, a2: Int, b1: Int, b2: Int): Boolean = a1 <= b1 && a2 >= b2
//
//    while (input != null) {
//      if (input != "") {
//        var sections = input.split(",").map(_.split("-"))
//        var x1 = sections(0)(0).toInt
//        var x2 = sections(0)(1).toInt
//        var y1 = sections(1)(0).toInt
//        var y2 = sections(1)(1).toInt
//
//        if (fOverlap(x1, x2, y1, y2) || fOverlap(y1, y2, x1, x2)) i+=1
//      }
//      input = readLine
//    }

    println(i)
  }
}
