fun main() {
    println("Enter a number between 1 and 10:")
    val number = readLine()?.toIntOrNull()

    when (number) {
        in 1..10 -> {
            val numberName = when (number) {
                1 -> "un"
                2 -> "deux"
                3 -> "trois"
                4 -> "quatre"
                5 -> "cinq"
                6 -> "six"
                7 -> "sept"
                8 -> "huit"
                9 -> "neuf"
                10 -> "dix"
                else -> ""
            }
            if (numberName.isNotEmpty()) {
                println("The number $number is $numberName in French.")
            } else {
                println("Unsupported number.")
            }
        }
        else -> {
            println("Invalid input. Please enter a number between 1 and 10.")
        }
    }
}