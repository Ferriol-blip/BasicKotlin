/**
 * @author Pablo Ferriol
 */

package ferriol.blip

import java.util.*


fun main() {
    val random = Random().nextInt(50) + 1

    val showMessage = when (random) {
        in 1..10 -> "random num: $random, range 1 to 10"
        in 11..20 -> " random num: $random, range 11 to 20"
        in 21..30 -> " random num: $random, range 21 to 30"
        in 31..40 -> " random num: $random, range 31 to 40"
        else -> "random num: $random, range more than 40"
    }

    println(showMessage)
}
