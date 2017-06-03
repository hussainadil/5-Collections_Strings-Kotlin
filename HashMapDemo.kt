//Hash Map Demo
fun main (args:Array<String>){
    var map =HashMap<Int,String>()
    map.put(1,"Aadil")
    map.put(2,"Aamir")
    map.put(3,"Aatif")
    for(k in map.keys){
        println(map.get(k))
    }
    println("After Updating value")

    // update way is also same just select key and rename string name
    map.put(3,"Aasim")
    for(k in map.keys){
        println(map.get(k))
    }
    // Searching
    if(map.containsValue("Aasim")){
        println("Name Found")
    }else {
        println("Not FOund")
    }
    println("Element by Index")
    for (index in 1..map.size-1){
        println("At index [$index]="+ map.get(index))
    }
}