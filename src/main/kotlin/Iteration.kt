fun main()
{
    var i = 0

    // While

    while (i <= 10)
    {
        println(i)
        i++
    }


    // For

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    for (car in cars)
    {
        val pesan = "Ini adalah mobil $car"
        println(pesan)
    }

    for (x in 1..9)
    {
        println(x)
    }

    for (char in "Polban")
    {
        println(char)
    }
}