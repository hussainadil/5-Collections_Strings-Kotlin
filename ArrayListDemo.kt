// Array List Demo
fun main (args: Array<String>){
    var arrayList =ArrayList<String>()
    arrayList.add("Aadil")
    arrayList.add("Aamir")
    arrayList.add("Aatif")
    arrayList.add("Aasim")
    println("Elements  By Object")
    for (elements in arrayList){
        println(elements)
    }
    println("Specfic name by index="+arrayList.get(2))
    //Update Name
    println("After Updating !!")
    arrayList.set(1,"Aamir Raza")
    for (elements in arrayList){
        println(elements)
    }

    // Searching
    println("Searcing Method")
    if(arrayList.contains("Aamir Raza")){
        println("Result Found")
    } else {
        println("Result not Found")
    }
    println("Result by Index")
    for (index in 0..arrayList.size-1)
    println("Element by Index [ $index ]="+arrayList[index])
}


