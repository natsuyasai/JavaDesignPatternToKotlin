class StringDisplay(string: String): AbstractDisplay() {
    private var string: String
    private var width: Int

    init{
        this.string = string
        this.width = string.length
    }

    override fun open(): Unit{
        printLine()
    }

    override fun print(): Unit{
        println("|" + this.string + "|")
    }

    override fun close(): Unit{
        printLine()
    }

    private fun printLine(): Unit{
        print("+")
        for (i in 0..width) {
            print("-")
        }
        println("+")
    }
}