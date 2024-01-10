fun main() {
    var litrosConsumidos=litrosConsumidos("Cuantos litros ha consumido?")
    println("Ha gastado un total de: $litrosConsumidos")
    var consumoAgua=consumoAguaPrecio(litrosConsumidos)
    println("El precio a pagar por el agua sin descuento es: $consumoAgua")
    var menuTipoBono=menuTipoBono("Tiene el descuento de familia numerosa (1)  " +
            "o un bono social (2)?")
    when (menuTipoBono){
        1-> println("Escogió familia numerosa")
        2-> println("Escogió el bono social")
    }
    var descuentoTipoBono=descuentoTipoBono(menuTipoBono)
    println("Se le descontará por su situación un ${descuentoTipoBono*100}%")
    var facturaAgua=facturaAgua("La factura total del agua será: ",consumoAgua,descuentoTipoBono)
    println(facturaAgua)
}