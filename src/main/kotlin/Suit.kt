
open class Suit : Hasil() {

    private val salah = "Mohon maaf ulangi dengan benar"
    protected var nilai = false
    private var dataSuit: String? = ""

    fun useSuit(jurusUser: String, suit: Array<String>): Boolean {
        for (i in 0 until suit.size) {
            if (jurusUser == suit[i]) {
                dataSuit = jurusUser
                nilai = true
                break
            } else {
                nilai = false
            }
        }
        return nilai
    }

    fun tesSuit(statusSuit: Boolean) {
        if (statusSuit == false) {
            println(salah)
        }
    }

    fun getStatusSuit(): String? {
        return dataSuit
    }

    override fun hasilSuit(pemain1: Boolean, pemain2: Boolean) {

        if (pemain1 == true && pemain2 == false) {
            print(statusMenang[0])
        } else if (pemain1 == false && pemain2 == true) {
            print(statusMenang[1])
        } else {
            print(statusMenang[2])
        }

    }

}