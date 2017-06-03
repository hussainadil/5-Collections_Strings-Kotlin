 // Array Demonstration
fun main (args:Array<String>){

 var arrayStr=Array<String>(4){""}
    var arrayInt= Array<Int>(5){0}
    arrayInt[2]=33
    println("Array "+arrayInt[2])

    for (element in arrayInt){
        println("Elements = "+element)
    }
    for (index in 0..4){
        println("Indexes ="+arrayInt[index])
    }
    for (index in 0..3){
        println("arrayStr[$index]=")
        arrayStr[index]= readLine()!!
    }
    for (index in 0..3){
        println("ArrayStr [ $index ] ="+arrayStr[index])
    }

}