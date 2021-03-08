package ferriol.blip

/*
 * @author Pablo Ferriol
 *
 *
 */

fun main() {
    val books = arrayListOf("Eragon", "Eldes", "Legado", "El ladron", "El gran lord", "El lobo")
    for (e in books) {
        if (e.contains("e")) {
            e.forEach { x -> print(x) }
        }
        println()
    }
}
