class CharDisplay(ch: Char): AbstractDisplay() {
    private var ch: Char

    init {
        this.ch = ch
    }

    override fun open(): Unit{
        print("<<")
    }

    override fun print(): Unit{
        print(ch)
    }

    override fun close(): Unit{
        println(">>")
    }
}