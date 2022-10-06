package oop

class Mobil(kapasitasTanki: Int)
{

    var merk: String = "Honda"
        get() = field
        set(value)
        {
            if (value == "Toyota")
            {
                field = "Toyota Fortuner"
            }
            else
            {
                field = "Honda"
            }
        }


    val tenaga = kapasitasTanki

    fun gas()
    {
        println("Gasss")
    }
}