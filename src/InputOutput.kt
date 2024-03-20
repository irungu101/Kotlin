import java.util.Scanner
fun main(args: Array<String>) {
    println("Please type your name here: ")
    val enteredName = readLine()
    println("You have entered your name as $enteredName")
    println("Please enter your age: ")
    val enteredAge = Integer.valueOf(readLine())
    println("You are $enteredAge years old")
    val read = Scanner(System.`in`)
    println("Enter your physics marks: ")
    val enteredMarks = read.nextInt()
    println("You got $enteredMarks in physics")
    println("Please enter your BMI: ")
    val enteredBmi = read.nextFloat()
    println("Your BMI is $enteredBmi ")
    println("Please enter your first score: ")
    val enteredScore1 = Integer.valueOf(readLine())
    println("Your first score is $enteredScore1")
    println("Please enter your second: ")
    val enteredscore2 = Integer.valueOf(readLine())
    println("Your second score is $enteredscore2")
    var summation = enteredScore1+enteredscore2
    println(summation)
    var subtraction = enteredScore1-enteredscore2
    println( subtraction)



}