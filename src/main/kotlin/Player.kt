class Player:Suit() {
    private var statusPlayer = false
    private var namaPlayer: String? = ""

    fun kondisiSuit(): Boolean {
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
            true -> this.statusPlayer = true
            else -> this.statusPlayer = false
        }
        return this.statusPlayer
    }
}