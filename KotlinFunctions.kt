import java.math.BigInteger
// functions
fun main(args: Array<String>){
    fun add(num1: Int, num2: Int): Int = num1 + num2
    println("5 + 4 =  ${add(5, 4)}")
    fun subtract(num1: Int, num2: Int): Int = num1 - num2
    println("5 - 4 =  ${subtract(5, 4)}")
    println("4 - 5 =  ${subtract(4, 5)}")
    println("4 - 5 =  ${subtract(num2 = 5, num1 = 4)}") //Keyword arguments
    fun sayHello(name: String): Unit = println("Hello $name")
    sayHello("Rajeev")
    val (two, three) = nextTwo(1)
    println("1 $two $three")

    // Lambda functions
    val multiply = {num1: Int, num2: Int -> num1 * num2}
    println("5 * 3 = ${multiply(5,3)}")

    // vararg functions  -  Variable number of arguments
    println("Sum = ${getSum(1,2,3,4,5)}")
    println("5! = ${fact(BigInteger("5"))}")

    // Higher Order functions
    val numList = 1..20
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach{n -> println(n)}

    val mult3 = makeMathFunc(3)
    println("5 * 3 = ${mult3(5)}")
    val multiply2 = {num1: Int -> num1 *2}
    val numList2 = arrayOf(1,2,3,4,5)
    mathOnList(numList2, multiply2)
}
//using Pair function - Represents a generic pair of two values
fun nextTwo(num: Int): Pair<Int, Int>{
    return Pair(num+1, num+2)
}
// Vararg functions definition
fun getSum(vararg nums: Int): Int{
    var sum = 0
    nums.forEach { n -> sum+=n }
    return sum
}
/* tail recursion in Kotlin using tailrec keyword
 tailrec modifier tells compiler to optimize the recursion.
 No stackoverflow error
 */
// uisng BigInteger to compute factorial of very large number
fun fact(x: BigInteger): BigInteger{
    tailrec fun factTail(y: BigInteger, z: BigInteger): BigInteger {
        if (y == BigInteger("0")) return z
        else return factTail(y - BigInteger("1"), y * z)
    }
    return factTail(x, BigInteger("1"))
    }
// Higher Order functions declaration
fun makeMathFunc(num1: Int): (Int) -> Int = {num2 -> num1 * num2}
fun mathOnList(numList: Array<Int>, myFunc:(num: Int) -> Int){
    for(num in numList){
        println("math On List: ${myFunc(num)}")
    }
}


