open class Mamifero(
    peso:Float,
    altura: Short,

) : Animal(
    peso,
    altura,
){
    open fun amamentar(): String = "Amamentando como um mamifero bem generico"

}