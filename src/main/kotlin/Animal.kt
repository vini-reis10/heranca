open class Animal(
    var peso: Float,
    var altura: Short,
){
    open fun emitirSom():String = "emitidindo som genérico"
    open fun comer():String = "comendo algo que não sei o que é"
}
