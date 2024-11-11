fun main(){
    val likes = 221
    val remainderOfTheNumber = likes % 10
    if(remainderOfTheNumber === 1 && likes != 11){
        println("понравилось $likes человеку")
    }
    else println("понравилось $likes людям")
}