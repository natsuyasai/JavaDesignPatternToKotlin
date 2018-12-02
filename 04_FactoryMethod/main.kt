import framework.*
import idcard.*

fun main(args: Array<String>){
    var factory = IDCardFactory()
    var card1 = factory.create("あああ")
    var card2 = factory.create("いいい")
    var card3 = factory.create("ううう")

    card1.use()
    card2.use()
    card3.use()
}