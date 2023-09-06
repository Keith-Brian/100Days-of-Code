class Car(): Engine {
    override fun start() {
       println("The car is moving")
    }

    override fun move() {
        println("The car has stopped moving")
    }

    override fun service() {
        println("The engine is being serviced")
    }

}