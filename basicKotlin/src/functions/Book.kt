package functions

class Book(val author: String, val pubYear: Int) {
    private var borrowed: Boolean

    init {
        this.borrowed = false
    }

    fun borrowed() {
        this.borrowed = true
    }

    fun returned() {
        this.borrowed = false
    }

    fun bookState() {
        println("$author--$pubYear--$borrowed")
    }
}

fun main() {
    val book = Book("Book1", 1995)
    book.bookState()
    book.borrowed()
    book.bookState()
    book.returned()
    book.bookState()
}
