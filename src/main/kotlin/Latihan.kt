fun main()
{
    print("Masukan Lama Parkir (Jam): ")

    var lamaParkir = Integer.valueOf(readLine())
    var biayaParkir: Float
    var biayaParkir2: Float
    var biayaParkir3: Float

    // rule biaya parkir

    val tarifDasar = 1.0
    val tarifBerikutnya = 0.5
    val maxTarifPerHari = 15

    if (lamaParkir in 0..5)
    {
        biayaParkir = tarifDasar.toFloat()*lamaParkir
    }
    else if (lamaParkir > 5 && lamaParkir < 24)
    {
        biayaParkir2 = (lamaParkir-5).toFloat()
        biayaParkir = 5+(tarifBerikutnya.toFloat()*biayaParkir2)
    }
    else
    {
        biayaParkir3 = (lamaParkir/24).toFloat()
        biayaParkir2 = (lamaParkir%24).toFloat()
        biayaParkir = (biayaParkir3*maxTarifPerHari).toFloat()+(tarifBerikutnya.toFloat()*biayaParkir2)
    }

    println("Lama Parkir: $lamaParkir")
    println("Biaya Parkir: $biayaParkir")
}