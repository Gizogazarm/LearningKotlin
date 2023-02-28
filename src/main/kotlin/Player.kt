class Player:Suit() {
    private var status = false
    private var namaPlayer: String? = ""

    fun nilaiAwalPlayer(): Boolean {
        return nilai
    }

    fun statusPemain() {
        if (this.status == true) {
            println("Pemain $namaPlayer MENANG !!")
        } else {
            println("Pemain $namaPlayer KALAH !!")
        }
    }

    fun setName(namaPemain: String) {
        this.namaPlayer = namaPemain
    }

    fun getName(): String? {
        return this.namaPlayer
    }
}