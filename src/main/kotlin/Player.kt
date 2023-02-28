class Player(namaPemain: String) {
    private var status = false
    private val namaPlayer = namaPemain

    fun statusPemain() {
        if (this.status == true) {
            println("Pemain $namaPlayer MENANG !!")
        } else {
            println("Pemain $namaPlayer KALAH !!")
        }
    }

    fun getName(): String {
        return this.namaPlayer
    }
}