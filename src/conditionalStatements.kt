fun main(args: Array<String>) {
    val age = 17
    if(age<18){
        println("You are not qualified to vote")
    }else{
        println("You are legible to vote")
    }
    val number = 2
    if (number==1){
        println("Oops you lost the game")
    }else if(number==2){
        println("Oops you are almost there")
    }else if (number==3){
        println("Congratulation you just won 1 million")
    }else{
        println("$number is not a valid number")
    }
    var y = 1
    when(y){
        1 -> println("Oops you lost the game")
        2 -> println("Oops you are almost there")
        3 -> println("Congratulation you just won 1 million")
        else -> println("$number is not a valid number")

    }
    println("Please enter your weight: ")
    val weight = Integer.valueOf(readLine())
    println("Your weight is $weight kilograms")
    println("Please enter your height: ")
    val height = Integer.valueOf(readLine())
    println("Your height is $height meters")
    var calc1 = height*height
    var bmi = weight/calc1
    println("Your bmi is $bmi")
    if (bmi<18){
        println("You are underweight")
    }else if(bmi in 18..25){
        println("You are normal")
    }else if (bmi in 25..30){
        println("You are overweight")
    }else if(bmi>30){
        println("You are obese ")
    }














}