// object classes are used for singleton classes (which are expensive to create)

object Database {

    init {
        println("Hey a new database is created!")

    }
    var url: String = ""
    var port: Int = 0

    fun connect(){
        println("Server connected")
    }

    fun disconnect(){
        println("Server disconnect!")
    }
}