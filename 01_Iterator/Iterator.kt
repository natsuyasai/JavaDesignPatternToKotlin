interface Iterator {
    public abstract fun hasNext(): Boolean
    public abstract fun <T> next(): T
}