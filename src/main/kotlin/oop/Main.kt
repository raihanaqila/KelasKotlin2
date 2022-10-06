package oop

fun main()
{
    val hewan = Hewan()
    hewan.makan()
    hewan.buangAir()

    val kucing = Kucing()
    println(kucing.isMamal)

    val ayam = Ayam()
    println(ayam.isMamal)
}