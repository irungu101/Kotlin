fun main(args: Array<String>) {
    val child1 = Child()
    child1.myfunction()
    val dog1 = Dog("Black", 12)
    dog1.woof()
    val cat1 = Cat("White", 10)
    cat1.meow()


}
open class Parent(){
    val x = 5

}
class Child: Parent(){
    fun myfunction(){
        println(x)
    }
}
open class Animal(val colour: String, val age:Int){
    init {
        println("Colour is $colour")
        println("Age is $age")
    }
}
class Dog( colour: String,  age: Int): Animal(colour,age){
    fun woof(){
        println("The dog makes woof sound")
    }
}
class Cat(colour: String, age: Int): Animal(colour, age){
    fun meow(){
        println("The cat makes meow sound")
    }
}















