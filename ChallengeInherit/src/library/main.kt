package library

fun main(args: Array<String>) {
    val book = Book("SilverHand", "Samurai", "Action", 2000)
    val dvd = DVD(20.02, "SamuInc", "SoundTrack", 2001)

    book.borow();
    dvd.borow();
    println(book.borrowed)
    println(dvd.borrowed)
}
