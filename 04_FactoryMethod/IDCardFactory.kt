package idcard
import framework.*

class IDCardFactory : Factory(){
    private var owners:MutableList<String> = ArrayList()

    protected override fun createProduct(owner: String): Product{
        return IDCard(owner)
    }

    protected override fun registerProduct(product: Product): Unit{
        if(product is IDCard)
        {
            owners.add(product.getOwner())
        }        
    }

    protected fun getOwners(): MutableList<String>{
        return owners
    }
}