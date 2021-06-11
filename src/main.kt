fun main() {
    var again: String
    var numCorrect = 0
    var answer: String
    var numPlayed = 1
    var totalCorrect=0

    // Welcome message and loop to "play" again
    do {
        println("***Welcome to Cadieux's 5 Quick Questions")
        println("about BASIC MATHEMATICS")

        print("What is the name of the answer after addition?  ")
        answer = readLine()!!.toString()
        if (answer.equals("sum", ignoreCase = true)){
            numCorrect++
            totalCorrect++
            println("CORRECT")
        }
        else{
            println("WRONG!")
        }

        print("What is the name of the answer after subtraction?  ")
        answer = readLine()!!.toString()
        if (answer.equals("difference", ignoreCase = true)){
            numCorrect++
            totalCorrect++
            println("CORRECT")
        }
        else{
            println("WRONG!")
        }

        print("What is the name of the answer after multiplication?  ")
        answer = readLine()!!.toString()
        if (answer.equals("product", ignoreCase = true)){
            numCorrect++
            totalCorrect++
            println("CORRECT")
        }
        else{
            println("WRONG!")
        }

        print("What is the name of the answer after division?  ")
        answer = readLine()!!.toString()
        if (answer.equals("quotient", ignoreCase = true)){
            numCorrect++
            totalCorrect++
            println("CORRECT")
        }
        else{
            println("WRONG!")
        }

        print("What is the name of the answer after modulus?  ")
        answer = readLine()!!.toString()
        if (answer.equals("remainder", ignoreCase = true)){
            numCorrect++
            totalCorrect++
            println("CORRECT")
        }
        else{
            println("WRONG!")
        }

        //All output for number for number of games played and questions correct
        println("Number Correct this game: $numCorrect\n" +
                "Number of Games played: $numPlayed\n" +
                "Total correct: $totalCorrect")

        print("Do you want to play again? (Y/N):")
        again = readLine()!!.first().toString()         //Reads first letter only of input
        if (again.equals("Y", ignoreCase = true)){
            numPlayed++
            numCorrect=0
        }
    }while(again.equals("Y", ignoreCase = true))  //Loops if beginning letter of input is "Y"
}