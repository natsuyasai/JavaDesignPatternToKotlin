open class Banner(string: String) {
    private var string: String
    init {
        this.string = string
    }
    
    fun showWithParen(): Unit {
        println("($string)")
    }

    fun showWithAster(): Unit {
        println("*$string*")
    }
}