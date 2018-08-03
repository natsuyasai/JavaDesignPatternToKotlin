class BookShelfIterator(bookShelf: BookShelf) : Iterator {
    private var bookShelf: BookShelf
    private var index: Int
    init {
        this.bookShelf = bookShelf
        this.index = 0
    }

    override fun hasNext(): Boolean {
        when {
            index < bookShelf.getLength() -> return true
            else -> return false
        }
    }

    override fun <T> next(): T {
        var book = bookShelf.getBookAt(index)
        index++
        return book as T
    }
}