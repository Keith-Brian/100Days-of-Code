class Car(var name:String,var brand:String, var door:Int) {

    // creating a constructor

    fun move(){
        println("The car is moving: ${this.name}")
    }

    fun stop(){
        println("The car is stopped: ${this.name}")
    }
}
