abstract class AbstractDisplay {
    abstract fun open(): Unit
    abstract fun print(): Unit
    abstract fun close(): Unit
    fun display(){
        open()
        for (i in 0..5) {
            print()
        }
        close()
    }
}