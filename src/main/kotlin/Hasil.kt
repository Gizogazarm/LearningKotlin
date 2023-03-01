abstract class Hasil {
    protected val statusMenang = arrayOf("Pemain 1 Menang", "Pemain 2 menang", "Seri")
    protected var saveMenang: String? = ""

    abstract fun hasilSuit(pemain1: Boolean, Pemain2: Boolean)

}



