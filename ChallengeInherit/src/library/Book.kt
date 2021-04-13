package library

class Book(val author: String, tittle: String, genre: String, year: Int) :
    InventoryItem(tittle, genre, year, borrowed = false) {
    override fun borow() {
        if (!borrowed) {
            println("Book borrowed")
            borrowed = true;
        }
    }
}
