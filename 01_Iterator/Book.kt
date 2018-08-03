class Book(name: String) {
    private var name: String

    init {
        this.name = name
    }

    public fun getName(): String {
        return this.name
    }
}