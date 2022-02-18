class Cachorro(
    var raca: String,
    peso: Float,
    altura: Short,


    ) : Mamifero(
    peso,
    altura,

    ) {
    override fun comer(): String = "comer ração de cachorro"
    override fun emitirSom(): String = "latir"
    override fun amamentar(): String = "mamando na teta da cadela"

    val ralf = Animal(45f,3000)
}