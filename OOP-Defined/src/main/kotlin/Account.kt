class Account {
    private var balance: Int =0
    private var transaction = mutableListOf<Int>()

    fun deposit(amount:Int){
        if (amount>0){
            this.transaction.add(amount)
            this.balance += amount
        } else{
            println("Cannot deposit negative values")
        }
        println("You have deposited: $amount, your new balance is: $balance")
    }

    fun withdraw(amount:Int){
        if (amount<0){
            println("Cannot withdraw negative values")
        }else{
            this.transaction.add(-amount)
            this.balance += -amount
        }
        println("You have withdrawn: $amount, your new balance is: $balance")
    }

    fun getBalance(){
        println("Your balance is: ${this.balance}")
    }


}