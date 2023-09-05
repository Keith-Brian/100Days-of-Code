fun main(){
    // using the late-init keyword
    lateinit var name:String
    var age = 19
    if(18 <= age) name = "Keith" else println("Still a minor")
    println("Hello,${name}");

    val car1 = Car("Passo","Toyota",4)
    println(car1.name)
    val car2 = Car("Passo","Toyota")
    car2.setColor("Green")
    println(car2.getColor())

    //instantiating the object classes
    var broker = Database
    broker.url = "https://test.mosquitto.org"
    broker.port = 1883

    broker.connect()

    //using the calculator functions
    println("The value is: ${Calculator.multiply(5,10)}")

}