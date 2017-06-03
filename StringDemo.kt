 // String demonstration
fun main(args:Array<String>){

    var title: String="Come On You Can Do It"

    println("1st way = Here We Go ! "+title) // 1st way + conqaninet
    println("2nd way = Here We Go ! $title") // 2nd way $ Dollar sign in semicolons

    var addTitle: String = "Aadil " + "Khan"
    println("Adding Two Names : $addTitle" )

    println("Specific Char = " +addTitle[3])
    println("Lower Case = " +title.toLowerCase())
    println("Upper Case = " +title.toUpperCase())
    println("Split" +title.split("e"))




}