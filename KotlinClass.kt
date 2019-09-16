fun main(args : Array<String>)
{
    println("Hello World  + ${add(7,8)}")
    println(add(3,4))
    println(subtract(9, 4))
    println(maxNumber(9,5))
    println(maxNumber(5,6))
    println(myArray[2])
}


var myArray = arrayOf(1,3,5,6,3,7,3,8)
var x = 5
fun add (num1 : Int , num2 : Int) : Int
{
    return num1+num2
}

fun subtract (num1 : Int , num2 : Int) : Int
{
    return num1-num2
}

fun maxNumber (num1 : Int , num2 : Int) : Int
{
    if(num1 > num2)
    {
        return num1
    }
    else
    {
        return num2
    }
}

fun randomSort(newArray : IntArray)
{
    var isSorted = false
    while(isSorted == false)
    {
        var num1 = 8
    }
}