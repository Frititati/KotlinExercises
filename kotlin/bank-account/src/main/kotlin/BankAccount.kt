
class BankAccount {
    // TODO: implement read access to 'balance'

    var balance:Long = 0
        get() {
            if(!closed) return field else throw IllegalStateException()
        }

    private var closed:Boolean = false;

    fun adjustBalance(amount: Long){
        this.balance
        synchronized(this){
            this.balance += amount
        }
    }

    fun close() {
        this.closed = true;
    }
}
