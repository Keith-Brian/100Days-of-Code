open class Animal(var legs: Int, var habitat: String, var hasTail: Boolean) {

    open fun eat(food: String){
        println("The animal is eating: $food")
    }

}