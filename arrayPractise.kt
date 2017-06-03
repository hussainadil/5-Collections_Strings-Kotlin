//Enhance more about array
fun main (args: Array<String>){
    var studRecord =Array<String>(5){""}
    for (index in 0..4){
        print("Add Record "+studRecord[index])
        studRecord[index]= readLine()!!
    }
        for (index in 0..4){
        println("Sudent Record [$index] ="+studRecord[index])
    }
}
