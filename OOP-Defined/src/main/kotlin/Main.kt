fun main() {
    //creating an instance of a class by lazy initialization for resource-expensive classes
    val student by lazy {
        Student("Keith",151725)
    }
    student.enrolled()

    // creating a new ListView objects
    val countries = ListView(arrayOf("Kenya","Uganda","Tanzania","Sudan","Egypt","Ireland"))
    countries.ListViewItems().displayItem(4)

    // creating a new bank account
    val user1 = Account()
    user1.deposit(1000)
    user1.withdraw(400)
    user1.getBalance()

    val car = Car()
    car.service();
    car.start();
}
