class Cachorro(
    var raca: String,
    peso: Float,
    altura: Short,


    ) : Mamifero(
    peso,
    altura,

    ){
        fun latir():String = "au au"
    }