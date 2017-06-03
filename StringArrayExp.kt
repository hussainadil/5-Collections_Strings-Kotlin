fun main (args:Array<String>){
    var Record=Array<String>(4){""}

    for(index in 0..3){
        println("Record : [ $index ] = ")
        Record[index]= readLine()!!
    }
    for(index in 0..3){
        println("Record : [ $index ] = "+Record[index])

    }
}