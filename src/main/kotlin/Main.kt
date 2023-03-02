fun main() {

    val suit = arrayOf("gunting", "batu", "kertas")
    val penjelasan = "Pilihan Suit : Gunting, Batu , Kertas ( Masukkan huruf dengan benar tanpa spasi)"
    val namaPemain1 = "Pemain 1"
    val namaPemain2 = "Pemain 2"
    val player1 = Player()
    val player2 = Player()
    val hasil = Suit()
    var mainLagi = true
    player1.setName(namaPemain1)
    player2.setName(namaPemain2)


    do {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")

        while (player1.kondisiSuit() == false) {
            println("1. Masukkan ${player1.getName()} :")
            println(penjelasan)
            println("==========================")
            val inputanPemain1 = readLine()?.lowercase()!!
            player1.tesSuit(player1.useSuit(inputanPemain1, suit))
        }


        while (player2.kondisiSuit() == false) {
            println("2. Masukkan ${player2.getName()} :")
            println(penjelasan)
            println("==========================")
            val inputanPemain2 = readLine()?.lowercase()!!
            player2.tesSuit(player2.useSuit(inputanPemain2, suit))
        }

        val dataSuit1 = player1.getStatusSuit()
        val dataSuit2 = player2.getStatusSuit()


        print("Hasil :")
        hasil.hasilSuit(player1.statusMenang(player1.tarungSuit(dataSuit2)), player2.statusMenang(player2.tarungSuit(dataSuit1)))

        println("Mau main lagi ? (Y/N) :")

        when (readLine()?.lowercase()!!) {
            "y" -> {
                player1.setKondisiSuit(setNilai = false)
                player2.setKondisiSuit(setNilai = false)
            }
            "n" -> {
                mainLagi = false
            }
            else -> {
                println("Pilihan tidak dimengerti")
            }
        }


    } while (mainLagi == true)

}
