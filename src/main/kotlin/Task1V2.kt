import kotlin.system.exitProcess

fun main(){
    task1()
}
fun task1() {

    println("შეიყვანეთ x ცვლადის მნიშვნელობა:")
    val x = readLine()?.toInt()!!
    println("შეიყვანეთ y ცვლადის მნიშვნელობა:")
    val y = readLine()?.toInt()!!
    println(" $x და $y ჯამი არის : ${z(x, y)}")
    println("გსურთ პროგრამის ხელახლა დაწყება <Y/N?")
    val ANSWER = readLine()
    if (ANSWER == "Yes" || ANSWER == "დიახ" || ANSWER == "Y" || ANSWER == "yes" || ANSWER == "y") {
        task1()
    } else {
        println("დასასრული")
        exitProcess(0)
    }

}


private fun z(x: Int, y: Int): Int {
    return x + y
}

