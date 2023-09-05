import java.awt.Color

class Car(name:String, var brand:String, var door:Int) {
  var name = name
  private var color: String =""

  fun setColor(color:String){
      this.color = color
  }

  fun getColor():String{
      return this.color
  }

    //Initialize keyword runs once when an object is created
    init {
        if (name=="Passo"){
            var name = name
        }else{
            println("Name Mismatch!")
        }
    }
    // Creating a secondary constructor
    constructor(name: String, brand: String):this(name,brand,0)

}
