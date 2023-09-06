class Birds(legs:Int,habitat:String,hasTail:Boolean):Animal(legs,habitat,hasTail) {
    override fun eat(food: String) {
        println("The bird is eating $food")
    }
}