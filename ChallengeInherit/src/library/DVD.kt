package library

class DVD(val lenght: Double, tittle: String, genre: String, year: Int) :
    InventoryItem(tittle, genre, year, borrowed = false) {
    override fun borow() {
        if (!borrowed) {
            println("DVD borrowed")
            borrowed = true;
        }

    }
}
