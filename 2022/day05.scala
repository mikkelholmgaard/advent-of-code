import scala.io.StdIn.readLine
import scala.collection.mutable.Stack
import scala.collection.mutable.ListBuffer

object Day05 {
  def main(args: Array[String]) = {
    var input = readLine
    var regexStacks = "(\\[(.*?)\\]|[ ]{4})".r
    var regexMoves = "[0-9]+".r
    var initList: ListBuffer[List[String]] = new ListBuffer[List[String]]()
    var moveList: ListBuffer[List[Int]] = new ListBuffer[List[Int]]()

    while (input != null) {
      if (input != "") {
        if (input.contains("[")) {
          initList += regexStacks.findAllIn(input).toList
        } else if (input.contains("move")) {
          moveList += regexMoves.findAllIn(input).map(_.toInt).toList
        }
      }
      input = readLine
    }

    var amountOfStacks = initList.sortWith(_.length > _.length).head.length
    // Make all arrays same length (needed for transpose). Rest filled with blanks.
    // Transpose to rotate 2D array 90 degrees
    var rotatedLists = initList.map { list =>
      var l = List.fill(amountOfStacks)(" ")
      (list ++ l.drop(list.length))
    }.toList.transpose

    var listOfStacks = rotatedLists.map(a => Stack.from(a.filter(_.trim.nonEmpty)))

    // First part
    def moveStack(amount: Int, from: Int, to: Int): Unit = {
      for (i <- 1 to amount) {
        listOfStacks(to - 1).push(listOfStacks(from - 1).pop())
      }
    }

    // Second part
//    def moveStack(amount: Int, from: Int, to: Int): Unit = {
//      var tempStack = new Stack[String]
//      for (i <- 1 to amount) {
//        tempStack.push(listOfStacks(from - 1).pop())
//      }
//      tempStack.toList.map(listOfStacks(to - 1).push(_))
//    }

    moveList.foreach(x => moveStack(x(0), x(1), x(2)))

    var result = listOfStacks.map(_.toList).map(_.head).mkString("")
      .replace("[", "").replace("]", "")

    println(result)
  }
}
