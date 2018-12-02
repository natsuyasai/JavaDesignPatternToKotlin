package idcard
import framework.*

class IDCard(owner: String) : Product() {
    private var owner: String

    init{
        println(owner + "のカードを作ります")
        this.owner = owner
    }

    override fun use(): Unit{
        println(this.owner + "のカードを使います")
    }

    fun getOwner(): String{
        return this.owner
    }
}