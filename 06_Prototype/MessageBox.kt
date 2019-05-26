import framework.*;

class MessageBox(decochar: Char): Product, Cloneable{
    private var decochar: Char
    init {
        this.decochar = decochar
    }

    override fun use(s: String){
        val length = s.toByteArray().size + 4
        for (i in 0..length) {
            print(decochar)
        }
        println("")
        println(decochar + " " + s + " " + decochar)
        for (i in 0..length) {
            print(decochar)
        }
        println("")
    }

    override fun createClone(): Product?{
        var p: Product? = null
        try {
            p = clone() as Product
        }
        catch(e: Exception) {
            e.printStackTrace()
        }
        return p
    }
}