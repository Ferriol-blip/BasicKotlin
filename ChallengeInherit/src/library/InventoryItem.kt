package library

abstract class InventoryItem(val tittle: String, val genre: String, val year: Int, var borrowed: Boolean) :
    Interfaces.lendable {
    override fun borow() {
        if (!borrowed) {
            borrowed = true; //if not borrowed, can by borrow
        } else {
            println("Is already borrowed")
        }
    }
}
