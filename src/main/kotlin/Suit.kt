open class Suit {

    private val salah = "Mohon maaf ulangi dengan benar"
    private var nilai = false
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
        if(statusSuit == true) {
            println(dataSuit)
        } else {
            println(salah)
        }
    }

}