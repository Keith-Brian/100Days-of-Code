fun main() {
    //creating an instance of a class by lazy initialization for resource-expensive classes
    val student by lazy {
        Student("Keith",151725)
    }
    student.enrolled()

    // creating a new ListView objects
    val countries = ListView(arrayOf("Kenya","Uganda","Tanzania","Sudan","Egypt","Ireland"))
    countries.ListViewItems().displayItem(4)
}