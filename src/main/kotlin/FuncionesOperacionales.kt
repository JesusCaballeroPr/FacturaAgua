import org.example.PURPLE_BOLD
import org.example.RED_BACKGROUND_BRIGHT
import org.example.RESET
import org.example.readDouble
import java.util.Scanner
import kotlin.math.round
val SCAN=Scanner(System.`in`)
/**
 * Calcula los litros consumidos de agua.
 *
 * @param mensaje, El mensaje a mostrar al usuario.
 * @return, Los litros consumidos.
 * @author, JesusCaballeroPr
 */
fun litrosConsumidos(mensaje: String): Double {
    println(mensaje)
    var litros = readDouble("¿Cuántos litros ha consumido?","No es un dato correcto","Fuera del rango",0.0,100000000.0)
    return litros
}
/**
 * Calcula el precio del agua consumida.
 *
 * @param litros, Los litros de agua consumidos.
 * @return, El precio del agua.
 * @author, JesusCaballeroPr
 */
fun consumoAguaPrecio(litros: Double): Double {
    val CUOTAFIJA = 6.0
    val CUOTAVARIABLE_1 = 0.15
    val CUOTAVARIABLE_2 = 0.30
    var precioAgua = 0.00
    if (litros < 50) {
        precioAgua += CUOTAFIJA
    } else if (litros >= 50 && litros <= 200) {
        precioAgua = litros * CUOTAVARIABLE_1 + CUOTAFIJA
    } else if (litros > 200) {
        precioAgua = litros * CUOTAVARIABLE_2 + CUOTAFIJA
    }
    return precioAgua
}
/**
 * Muestra un menú al usuario para seleccionar el tipo de bono.
 *
 * @param mensaje, El mensaje a mostrar al usuario.
 * @return, El tipo de bono seleccionado por el usuario.
 * @author, JesusCaballeroPr
 */
fun menuTipoBono(mensaje: String): Int {
    var dato = false
    var tipo = 0
    do {
        println(mensaje)
        dato = SCAN.hasNextInt()
        if (!dato) {
            println(RED_BACKGROUND_BRIGHT + "No es un valor admitido" + RESET)
        } else {
            tipo = SCAN.nextInt()
            if (tipo < 1 || tipo > 2) {
                println(RED_BACKGROUND_BRIGHT + "Valor fuera de rango" + RESET)
                dato = false
            }
        }
        SCAN.nextLine()
    } while (!dato)
    when (tipo) {
        1 -> println("Ha escogido familia numerosa")
        2 -> println("Ha escogido bono social")
        else -> println("Opción no válida")
    }

    return tipo
}
/**
 * Calcula el descuento aplicable en función del tipo de bono.
 *
 * @param tipoBono, El tipo de bono seleccionado por el usuario.
 * @return, El descuento aplicable.
 * @author, JesusCaballeroPr
 */
fun descuentoTipoBono(tipoBono: Int): Double {
    var descuento = 0.0
    when (tipoBono) {
        1 -> {
            println("¿Cuántos miembros de familia son?")
            var numeroMiembros = SCAN.nextInt()
            if (numeroMiembros == 4 || numeroMiembros == 5) {
                descuento = (10 * numeroMiembros / 100.0)
            } else if (numeroMiembros > 5) {
                descuento = 0.5
                println("Descuento máximo del 50%")
            }
        }
        2 -> {
            descuento = 0.8
            println("Se le aplicará el bono social")
        }
    }
    return descuento
}
/**
 * Calcula la factura del agua.
 *
 * @param mensaje, El mensaje a mostrar al usuario.
 * @param consumoAgua, El consumo de agua.
 * @param descuentoTipoBono, El descuento aplicable.
 * @return, La factura del agua.
 * @author, JesusCaballeroPr
 */
fun facturaAgua(mensaje: String, consumoAgua: Double, descuentoTipoBono: Double): String {
    var cuotaFija = 6.0
    if (descuentoTipoBono == 0.8) {
        cuotaFija = 3.0
    }
    var descuento = consumoAgua * descuentoTipoBono
    var totalConsumo = consumoAgua - descuento
    var total = totalConsumo

    // Redondear a dos cifras decimales
    total = round(total * 100) / 100
    descuento = round(descuento * 100) / 100
    cuotaFija = round(cuotaFija * 100) / 100

    return PURPLE_BOLD+"$mensaje $total€, se le ha descontado $descuento€ y la cuota fija es de $cuotaFija€"+ RESET
}