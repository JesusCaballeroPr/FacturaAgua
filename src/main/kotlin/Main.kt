import kotlin.math.round

fun main() {
        var litrosConsumidos = litrosConsumidos("Bienvenido a su cálculo de agua favorito")
        println("Ha gastado un total de: $litrosConsumidos litros")
        var consumoAgua = consumoAguaPrecio(litrosConsumidos)
        println("El precio a pagar por el agua sin descuento es: ${round(consumoAgua*100)/100} €")
        var menuTipoBono = menuTipoBono("¿Tiene el descuento de familia numerosa (1) o un bono social (2)?")
        var descuentoTipoBono = descuentoTipoBono(menuTipoBono)
        println("Se le descontará por su situación un ${descuentoTipoBono * 100}%")
        var facturaAgua = facturaAgua("La factura total del agua será: ", consumoAgua , descuentoTipoBono)
        println(facturaAgua)
}