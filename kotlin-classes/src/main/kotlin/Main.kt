fun main(){
    val name: String = "Keith"
    println("Hello,${name}");

    val car1 = Car("Toyota","Passo",4)
    car1.brand = "Fielder"
    println("This is: ${car1.brand}")

    car1.move()

}