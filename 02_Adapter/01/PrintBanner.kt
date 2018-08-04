class PrintBanner(string: String): Banner(string), Print {
    

    override fun printWeak(): Unit{
        showWithParen()
    }

    override fun printStrong(): Unit {
        showWithAster()
    }
}