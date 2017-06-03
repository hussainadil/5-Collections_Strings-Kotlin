// Simple Array practise
fun main (args:Array<String>){
    var arrayData=Array<Int>(5){0}
    arrayData[0]=11
    arrayData[1]=12
    arrayData[2]=13
    arrayData[3]=14
    arrayData[4]=15
    println("All Element Show By Object")
    for (element in arrayData){
        println("By Object: " +element)
    }
    for (index in 0..4){
        println("By Index: " +arrayData[index])
    }
}