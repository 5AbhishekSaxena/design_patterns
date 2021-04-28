package tech.developingdeveloper.dependency_injection


/**
 * Created by Abhishek Saxena on 17-04-2021.
 */

class Pasta(private val sauce: Sauce) {

    fun getPasta(): String = "I am pasta with ${sauce.getSauceType()} sauce"

}

interface Sauce {
    fun getSauceType(): String
}

class RedSauce : Sauce {
    override fun getSauceType(): String = "Red"
}

class WhiteSauce : Sauce {
    override fun getSauceType(): String = "White"
}

class GreenSauce : Sauce {
    override fun getSauceType(): String = "Green"
}

fun main() {

    val redSauce = RedSauce()
    val whiteSauce = WhiteSauce()
    val greenSauce = GreenSauce()

    val redSaucePasta = Pasta(redSauce)
    println(redSaucePasta.getPasta())

    val whiteSaucePasta = Pasta(whiteSauce)
    println(whiteSaucePasta.getPasta())

    val greenSaucePasta = Pasta(greenSauce)
    println(greenSaucePasta.getPasta())

}

