package framework

interface Product{
    abstract fun use(s: String)
    abstract fun createClone(): Product?
}