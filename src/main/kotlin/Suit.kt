@Suppress("UNREACHABLE_CODE")
open class Suit: Hasil() {

    private val salah = "Mohon maaf ulangi dengan benar"
    protected var nilai = false
    private var dataSuit: String? = ""

    fun useSuit(jurusUser: String, suit: Array<String>):Boolean {
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
        if(statusSuit == false) {
            println(salah)
        }
    }

    fun getStatusSuit():String?{
        return dataSuit
    }

    override fun hasilSuit(suit1: Boolean, suit2: Boolean) {
        TODO("Not yet implemented")
        if(suit1 == true && suit2 == false) {
            saveMenang = statusMenang[0]
        } else if (suit1 == false && suit2 == true) {
            saveMenang = statusMenang[1]
        } else {
            saveMenang = statusMenang[2]
        }

    }

}