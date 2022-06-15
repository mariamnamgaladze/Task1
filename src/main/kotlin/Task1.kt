fun main() {
    while (true) {
        println("შეიყვანეთ x ცვლადის მნიშვნელობა:")
        val x = readLine()?.toInt()!!
        println("შეიყვანეთ y ცვლადის მნიშვნელობა:")
        val y = readLine()?.toInt()!!
        println(" $x და $y ჯამი არის : ${z(x, y)}")
        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N?")
        val ANSWER = readLine()
        if (ANSWER == "Yes" || ANSWER == "დიახ" || ANSWER == "Y" || ANSWER == "yes" || ANSWER == "y")
            continue
        println("დასასრული")

        break
    }
}

private fun z(x: Int, y: Int): Int {
    return x + y
}