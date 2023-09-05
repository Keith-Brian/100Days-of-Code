public class Student(var name:String,var number: Int){
    var feePayment: Int =0
    var clearedFee:Boolean = false

    fun enrolled(){
        println("The student is enrolled")
    }
    fun suspended(){
        println("The student is suspended")
    }

}
