package oo

class Book(val title: String, val author: String, val year: Int, var price: Double) {
    override fun toString(): String {
        return "Book(tittle=$title, author=$author"
    }
}

data class DataBook(val title: String, val author: String, val year: Int, var price: Double) {
    /*Data clases ya parsea la clase a toString*/
}

fun main(args: Array<String>) {
    val book = Book("Super book", "John SilverHand", 1900, 30.20)
    val book2 = Book("Super book", "John SilverHand", 1900, 30.20)
    val dataBook = DataBook("Samurai", "John SilverHand", 1950, 40.20)
    val dataBook2 = DataBook("Samurai", "John SilverHand", 1950, 40.20)

    val dataBook3 = dataBook.copy(price = 80.80) /*metodo copy, permite copiar la clase entera y modficiarl al vuelo*/

    val (title, author) = dataBook; /*instanciar y acceder a varias propiedades*/
    println("$title--$author")

    val set = hashSetOf(dataBook,dataBook2,dataBook3) /*setOff*/
    println("setOff -> $set")

    println(book)
    println(dataBook)
    println(dataBook3)

    println(book.equals(book2))
    println(dataBook.equals(dataBook2))

}
