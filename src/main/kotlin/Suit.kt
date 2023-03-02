open class Suit : Hasil() {

    private val salah = "Mohon maaf ulangi dengan benar"
    protected var nilaiKondisiSuit = false
    private var nilaiTarungSuit = false
    private var dataSuit: String? = ""

    fun useSuit(jurusUser: String, suit: Array<String>): Boolean {
        for (i in 0 until suit.size) {
            if (jurusUser == suit[i]) {
                dataSuit = jurusUser
                nilaiKondisiSuit = true
                break
            } else {
                nilaiKondisiSuit = false
            }
        }
        return nilaiKondisiSuit
    }

    fun tesSuit(statusSuit: Boolean) {
        if (statusSuit == false) {
            println(salah)
        }
    }

    fun getStatusSuit(): String? {
        return dataSuit
    }

    fun tarungSuit(dataSuitLawan: String?): Boolean {
        when (dataSuit == dataSuitLawan) {
            true -> nilaiTarungSuit = false
            false ->
                if (dataSuit == "gunting" && dataSuitLawan == "kertas") {
                    nilaiTarungSuit = true
                } else if (dataSuit == "kertas" && dataSuitLawan == "batu") {
                    nilaiTarungSuit = true
                } else if (dataSuit == "batu" && dataSuitLawan == "gunting") {
                    nilaiTarungSuit = true
                } else {
                    nilaiTarungSuit = false
                }
        }
            return nilaiTarungSuit
    }


    override fun hasilSuit(pemain1: Boolean, pemain2: Boolean) {

        if (pemain1 == true && pemain2 == false) {
            println(statusMenang[0])
        } else if (pemain1 == false && pemain2 == true) {
            println(statusMenang[1])
        } else {
            println(statusMenang[2])
        }

    }

}