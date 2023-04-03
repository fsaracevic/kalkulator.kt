import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Enter the operation you want to perform: sum, sub, div, mul")
        val operation = scanner.nextLine()

        if (operation in listOf("sum", "sub", "div", "mul")) {
            var firstNumber: Double? = null
            var secondNumber: Double? = null

            while (firstNumber == null) {
                print("Enter the first number: ")
                firstNumber = readDouble(scanner)
            }

            while (secondNumber == null) {
                print("Enter the second number: ")
                secondNumber = readDouble(scanner)
            }

            when (operation) {
                "sum" -> println("Result: ${firstNumber + secondNumber}")
                "sub" -> println("Result: ${firstNumber - secondNumber}")
                "div" -> {
                    if (secondNumber == 0.0) {
                        println("Error: Division by zero is not allowed.")
                    } else {
                        println("Result: ${firstNumber / secondNumber}")
                    }
                }
                "mul" -> println("Result: ${firstNumber * secondNumber}")
            }
        } else {
            println("Invalid operation. Please try again.")
        }

        println()
    }
}

fun readDouble(scanner: Scanner): Double? {
    return try {
        scanner.nextLine().toDouble()
    } catch (e: NumberFormatException) {
        println("Invalid input. Please enter a number.")
        null
    }
}
