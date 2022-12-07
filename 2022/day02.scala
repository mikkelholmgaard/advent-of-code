import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer

object Day02 {
    def result(play: Array[String]): Int = {
        play(0) match
            case "A" => if (play(1) == "X") 4 else if (play(1) == "Y") 8 else 3
            case "B" => if (play(1) == "X") 1 else if (play(1) == "Y") 5 else 9
            case "C" => if (play(1) == "X") 7 else if (play(1) == "Y") 2 else 6
    }

    def main(args: Array[String]) = {
        var input = readLine
        var score = 0

        while (input != null) {
            if (input != "") {
                score += result(input.split(" "))
            }
            input = readLine
        }

        println(score)
    }
}
