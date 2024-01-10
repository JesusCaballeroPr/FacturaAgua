import java.util.Scanner
val SCAN=Scanner(System.`in`)
fun litrosConsumidos(mensaje:String):Double{
    println(mensaje)
    var litros=SCAN.nextDouble()
    return litros
}
fun consumoAguaPrecio (litros: Double):Double{
    var min=50
    var max=200.0
    val CUOTAFIJA=6
    val CUOTAVARIABLE_1=0.15
    val CUOTAVARIABLE_2=0.30
    var precioAgua=0.00
    if (litros<50){
        precioAgua+=CUOTAFIJA
    }else if (litros>=min||litros<=max){
        precioAgua=litros*CUOTAVARIABLE_1+CUOTAFIJA
    }else if (litros>max){
        precioAgua=litros*CUOTAVARIABLE_2+CUOTAFIJA
    }
    return precioAgua
}
fun menuTipoBono (mensaje:String): Int {
    println(mensaje)
        var tipo=SCAN.nextInt()
    when (tipo) {
        1 ->
            ""

        2 ->
            ""

        else-> println("Opción no valida")
    }
    return tipo
}
fun descuentoTipoBono(tipoBono:Int): Double {
    var descuento=0.0
    var cuotaFija=6
    when (tipoBono) {
        1 -> {
            println("Cuantos miembros de familia son?")
            var numeroMiembros = SCAN.nextInt()
            if (numeroMiembros==5||numeroMiembros==2) {
                 descuento = (10 * numeroMiembros/100.0)
            }
            if (numeroMiembros>5){
                println("Descuento máximo del 50%")
            }
        }
        2 -> {
            val BONOSOCIAL = 80
            println("Se le aplicara el bono social")
            cuotaFija=3
            descuento = (BONOSOCIAL / 100.0)
        }
    }
    return descuento
}
fun facturaAgua(mensaje: String, consumoAgua:Double, descuento:Double):Double{
    println(mensaje)
    var facturaAgua=consumoAgua*descuento
    return facturaAgua
}