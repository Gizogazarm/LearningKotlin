class Player:Suit() {
    private var status = false
    private var namaPlayer: String? = ""

    fun nilaiAwalPlayer(): Boolean {
        return nilai
    }

    fun setName(namaPemain: String) {
        this.namaPlayer = namaPemain
    }

    fun getName(): String? {
        return this.namaPlayer
    }

    fun statusMenang (status: Boolean): Boolean {
        when(status) {
            true -> this.status = true
            else -> this.status = false
        }
        return this.status
    }
}