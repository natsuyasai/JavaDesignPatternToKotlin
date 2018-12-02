package framework
abstract class Factory {
    final fun create(owner: String): Product{
        var p = createProduct(owner)
        registerProduct(p)
        return p;
    }
    protected abstract fun createProduct(owner: String): Product
    protected abstract fun registerProduct(product: Product): Unit
}