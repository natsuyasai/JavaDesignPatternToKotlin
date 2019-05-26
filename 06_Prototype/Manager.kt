package framework
import java.util.*

class Manager {
    private var showcase = HashMap<String, Product>()

    fun register(name:String, proto: Product){
        showcase.put(name,proto)
    }

    fun create (protoname: String): Product?{
        var p = showcase.get(protoname)
        return p?.createClone()
    } 
}