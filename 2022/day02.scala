import scala.io.StdIn.readLine

object Day02 {
    def result(play: Array[String], correctUse: Boolean): Int = {
        correctUse match {
            case false =>
                play(0) match
                    case "A" => if (play(1) == "X") 1+3 else if (play(1) == "Y") 2+6 else 0+3
                    case "B" => if (play(1) == "X") 0+1 else if (play(1) == "Y") 2+3 else 3+6
                    case "C" => if (play(1) == "X") 1+6 else if (play(1) == "Y") 0+2 else 3+3
            case true => {
                play(0) match
                    case "A" => if (play(1) == "X") 0+3 else if (play(1) == "Y") 3+1 else 6+2
                    case "B" => if (play(1) == "X") 0+1 else if (play(1) == "Y") 3+2 else 6+3
                    case "C" => if (play(1) == "X") 0+2 else if (play(1) == "Y") 3+3 else 6+1
            }
        }
    }

    def main(args: Array[String]) = {
        var input = readLine
        var score = 0
        var otherScore = 0

        while (input != null) {
            if (input != "") {
                var x = input.split(" ")
                score += result(x, false)
                otherScore += result(x, true)
            }
            input = readLine
        }

        println(score)
        println(otherScore)
    }
}
