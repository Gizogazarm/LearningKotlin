fun main() {

    val namaPemain1 = "Pemain 1"
    val namaPemain2 = "Pemain 2"
    val player1 = Player(namaPemain1)
    val player2 = Player(namaPemain2)


    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")
    println("1. Masukkan ${player1.getName()} :")
    val inputanPemain1 = readLine()?.lowercase()!!
    println("2. Masukkan ${player2.getName()} :")
    val inputanPemain2 = readLine()?.lowercase()!!


}