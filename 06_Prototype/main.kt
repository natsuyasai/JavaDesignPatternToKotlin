import framework.*

fun main(args: Array<String>){
    // 準備
    var manager: Manager = Manager()
    var upen: UnderlinePen = UnderlinePen('~')
    var mbox = MessageBox('*')
    var sbox = MessageBox('/')
    manager.register("strong message", upen)
    manager.register("warning box", mbox)
    manager.register("slash box", sbox)

    // 生成
    var p1 = manager.create("strong message")
    p1?.use("Hello, world.")
    var p2 = manager.create("warning box")
    p2?.use("Hello, world.")
    var p3 = manager.create("slash box")
    p3?.use("Hello, world.")
}