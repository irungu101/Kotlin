fun main(args: Array<String>) {
    val arr1 = arrayOf(13, "Students", 12.4, 'd')
    val arr2 = arrayOf<Int>(868,979,46,64)
    val arr3 = arrayOf<String>("John", "Alex", "Peter")
    println(arr1[1])
    println(arr1[2])
    println(arr1[3])
    //modifying an array
    arr1[0] = 26
    println(arr1[0])
    val fruits = arrayOf("apples", "mango", "grapes")
    fruits.set(1, "Pineapple")
    println(fruits[1])
    //get function to fetch
    val cars = arrayOf("Aston Martin", "Porsche", "AMG")
    println(cars.get(0))
    val employees = arrayOf("Jeremy", "James", "Richard")
    println(employees)
    employees.set(1, "Chris")
    println(employees[1])
    println(employees.get(2))



















}