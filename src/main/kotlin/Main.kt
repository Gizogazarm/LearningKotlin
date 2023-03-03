fun main() {

    val suit = arrayOf("gunting", "batu", "kertas")
    val penjelasan = "Pilihan Suit : Gunting, Batu , Kertas ( Masukkan huruf dengan benar tanpa spasi)"
    val player1 = Player("Pemain 1")
    val player2 = Player("Pemain 2")
    val hasil = Suit()
    var mainLagi = true
    var ulang = false



    do {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")

        if (ulang == true) {
            ulang = false
        }

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

        while (ulang == false) {
            println("Mau main lagi ? (Y/N) :")

            when (readLine()?.lowercase()!!) {
                "y" -> {
                    player1.setKondisiSuit(setNilai = false)
                    player2.setKondisiSuit(setNilai = false)
                    ulang = true
                }
                "n" -> {
                    mainLagi = false
                    ulang = true
                }
                else -> {
                    println("PILIHAN TIDAK DIMENGERTI !!!!")
                    ulang = false
                }
            }
        }


    } while (mainLagi == true)
}

