package calculate

fun main(){
    val calc = CalcApp()
    println("hello")
    val a = 10
    val b = 20
    println(calc.add(a, b))
    println(calc.sub(a, b))
    println(calc.mul(a, b))
    println(calc.div(b, a))
}