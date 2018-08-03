
class BookShelf(index: Int) : Aggregate {
    private var books: MutableList<Book>
    init {
        this.books = ArrayList(index)
    }
    
    fun getBookAt(index: Int): Book {
        return books.get(index);
    }

    fun appendBook(book: Book): Unit {
        books.add(book)
    }

    fun getLength(): Int {
        return books.size
    }

    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}