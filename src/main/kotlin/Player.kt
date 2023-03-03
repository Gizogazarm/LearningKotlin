class Player(private val namaPemain: String):Suit() {
    private var statusPlayer = false

    fun kondisiSuit(): Boolean {
        return nilaiKondisiSuit
    }

    fun setKondisiSuit(setNilai:Boolean) {
        nilaiKondisiSuit = setNilai
    }

    fun getName(): String {
        return this.namaPemain
    }

    fun statusMenang (status: Boolean): Boolean {
        when(status) {
            true -> this.statusPlayer = true
            else -> this.statusPlayer = false
        }
        return this.statusPlayer
    }
}