import java.util.Random
fun main() {
    println("Hello World")
    //variables
    val name = "Shivraj";
    var myAge = 21
    println("My name is ${name} and I am ${myAge} years old")
    println("My name is " + name + " and I am " + myAge + " years old")

    //data types
    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE
    println("Biggest Int : " + bigInt)
    println("Smallest Int : $smallInt")
    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE
    println("Biggest Float : " + bigFloat)
    println("Smallest Float : $smallFloat")
    var dblnum1: Double = 1.1111111111111111
    var dblnum2: Double = 1.1111111111111111
    println("Sum : ${dblnum1+dblnum2}")

    // is operator
    var letterGrade: Char = 'A'
    println("A is a letter : ${letterGrade is Char}")
    println("3.14 to integer: ${3.14.toInt()}")
    println("A to integer: ${'A'.toInt()}")
    println("65 to Char: ${65.toChar()}")

    // Strings methods
    val myName = "Shivraj Nag"
    var fName: String = "Mainak"
    var lName: String = "Nag"
    fName = "Suraj"
    var fullName = fName + " " + lName
    println("Name: ${fullName}")
    println("String Length: ${fullName.length}")
    var str1 = "A random string"
    var str2 = "a random string"
    println("Strings Equal: ${str1.equals(str2)}")// String equality
    println("Compare A to B: ${"A".compareTo("B")}")// String Comparison
    println("Compare C to B: ${"C".compareTo("B")}")
    //println("2nd index: ${str1.get(2)}")
    println("2nd index: ${str1[2]}") // Indexing operator
    println("Index from 2 to -7: ${str1.subSequence(2,8)}")// Substring extraction
    println("Contains random: ${str1.contains("random")}")// Substring Checking
    println("Contains venue: ${str1.contains("venue")}")

    // Arrays
    var myArray = arrayOf(1, 1.23, "Doug")
    println(myArray) //java.lang.Object;@7a81197d
    println(myArray[2])
    myArray[1] = 3.14
    println("Array length: ${myArray.size}")
    println("Doug in myArray: ${myArray.contains("Doug")}")
    var partArray = myArray.copyOfRange(0, 1)
    println("First element: ${partArray.first()}")
    println("Doug index: ${myArray.indexOf("Doug")}")
    var sqArray = Array(5, {x-> x * x})
    println(sqArray[0])
    println(sqArray[1])
    println(sqArray[2])
    println(sqArray[3])
    println(sqArray[4])
    var arr2: Array<Int> = arrayOf(1,2,3,4,5)
    println(arr2[1])
    var arr3 = intArrayOf(1,2,3,4,5)
    println(arr3[1])

    //Ranges
    val oneTo10 = 1..10
    val alpha = "A".."Z"
    println("R in alpha: ${"R" in alpha}")
    val tenTo1 = 10.downTo(1)
    val twoTo20 = 2.rangeTo(20)
    val rng3 = oneTo10.step(3)
    for (x in rng3) println("rang3: ${x}")
    for (x in tenTo1.reversed()) println("Reversed: $x")

    //Conditionals
    // if/else logic
    val age = 8
    if(age < 5){
        println("Go to preschool")
    }else if(age == 5){
        println("Go to Kindergarten")
    }else if((age > 5) && (age <= 17)){
        val grade = age - 5
        println("Go to grade: $grade")
    }else{
        println("Go to College")
    }
    //using when(similar to switch in other languages
    when(age){
        0,1,2,3,4 -> println("Go to preschool")
        5 -> println("Go to Kindergarten")
        in 6..17 -> {
            val grade = age -5
            println("Go to Grade: $grade")
        }
        else -> println("Go to College")
    }

    //Looping
    for(x in 1..10){
        println("Loop: $x")
    }

    val rand = Random()
    val magicNumber = rand.nextInt(50) + 1
    var guess = 0
    while(guess != magicNumber){
        println("Guess: $guess")
        guess += 1
    }
    println("Magic Number was $guess")

    // continue/break statements
    for(x in 1..20){
        if(x % 2 == 0) continue
        println("Odd: $x")
        if(x == 15) break
    }
    var arr4 = intArrayOf(3, 6, 9)
    //Looping using values
    for(x in arr4){
        println("$x")
    }
    //Looping using indices
    for(i in arr4.indices){
        println("Mult 3: ${arr4[i]}")
    }
    //Looping using both indices and values
    for((index, value) in arr4.withIndex()){
        println("Index: ${index} and Value: ${value}")
    }






}