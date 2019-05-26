import framework.*

class UnderlinePen(ulchar: Char): Product, Cloneable {
    var ulchar: Char
    init{
        this.ulchar = ulchar
    }

    override fun use(s: String){
        val length: Int = s.toByteArray().size
        println("\"" + s + "\"")
        print(" ")
        for (i in 0..length) {
            print(ulchar)
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