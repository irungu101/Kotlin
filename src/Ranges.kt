fun main(args: Array<String>) {
    1..10
    1.rangeTo(10)
    val myvariables = 20..50
    for(variable in myvariables){
        println(variable)
    }
    val var2 = 11.rangeTo(51)
    for (varr in var2){
        println(varr)
    }
    val alpha = 'A'..'Z'
    for(a in alpha){
        println(a)
    }
    val alpha1 = 'A'..'P'
    for(a in alpha1){
        println(a)
    }
    val var4 = 10.downTo(1)
    for (one in var4){
        println(one)
    }
    val marks = 1.rangeTo(10)
    marks.step(3)


}