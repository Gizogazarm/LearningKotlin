fun main() {

    val suit = arrayOf("gunting", "batu", "kertas")
    val namaPemain1 = "Pemain 1"
    val namaPemain2 = "Pemain 2"
    val player1 = Player()
    val player2 = Player()
    val hasil = Suit()
    player1.setName(namaPemain1)
    player2.setName(namaPemain2)

    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")
    println("Pilihan Suit : Gunting, Batu , Kertas")
    while (player1.kondisiSuit() == false) {
        println("1. Masukkan ${player1.getName()} :")
        val inputanPemain1 = readLine()?.lowercase()!!
        player1.tesSuit(player1.useSuit(inputanPemain1, suit))
    }

    var dataSuit1 = player1.getStatusSuit()

    while (player2.kondisiSuit() == false) {
        println("2. Masukkan ${player2.getName()} :")
        val inputanPemain2 = readLine()?.lowercase()!!
        player2.tesSuit(player2.useSuit(inputanPemain2, suit))
    }

    var datasuit2 = player2.getStatusSuit()


    print("Hasil :")
    hasil.hasilSuit(true,false)

}