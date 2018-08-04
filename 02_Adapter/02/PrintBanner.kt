class PrintBanner(string: String): Print() {

    var banner: Banner  

    init {
        this.banner = Banner(string)
    }  

    override fun printWeak(): Unit {
        banner.showWithParen()
    }

    override fun printStrong(): Unit {
        banner.showWithAster()
    }
}