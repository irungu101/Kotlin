fun main(args: Array<String>) {
    val obj1 = Cars("Vitz", "Toyota", "2000" )
    val obj2 = Cars("Ford", "Mustang", "1990")
    val obj3 = Cars("Outback", "Subaru", "2005")
    println(obj1.model)
    println(obj2.brand)
    val person1 = Person("Joshua", 15)
    person1.canVote(15)
    val person2 = Person("Esther", 22)
    person2.canVote(22)
    val person3 = Person("Kinuthia", 67)
    person3.canVote(67)
    val student1 = Student("Peter", 50)
    student1.promotion(50)
    val student2 = Student("Jude", 70)
    student2.promotion(70)
    val student3 = Student("Felix", 80)
    student3.promotion(80)
    val product1 = Product("Sugar", 200.50, 12)
    val totalCost = product1.calculateTotalCost()
    println(totalCost)
    val product2 = Product("Salt", 150.50, 20)
    val totalCost1 = product2.calculateTotalCost()
    println(totalCost1)

}
class Cars(val model: String, val brand:String,val year:String){

}
class Person(val name:String, val age:Int){
    fun canVote(age : Int){
        if (age<18){
            println("You cannot vote")
        }else {
            println("You can vote")
        }
    }
}
class Student(val name:String, val marks:Int){
    fun promotion(marks : Int){
        if (marks<60){
            println("You cannot be promoted")
        }else {
            println("You can be promoted")
        }
    }
}
class Product(
    val name: String,
    val price: Double,
    val quantity: Int
){
    fun calculateTotalCost(): Double{
        return price * quantity
    }
}




