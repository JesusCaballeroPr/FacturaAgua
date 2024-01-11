import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

class FuncionesOperacionalesKtTest{

        @Test
        fun testLitrosConsumidos() {
            val litros = litrosConsumidos("Mensaje")
            assertEquals(50.0, litros, "Los litros consumidos deben ser 50.0")
        }

    @Test
    fun testConsumoAguaPrecio() {
        val precio = consumoAguaPrecio(100.0)
        assertEquals(21.0, precio, "El precio del agua debe ser 21.0")
    }

        @Test
        fun testMenuTipoBono() {
            val tipo = menuTipoBono("Mensaje")
            assertEquals(1, tipo, "El tipo de bono debe ser 1")
        }

        @Test
        fun testDescuentoTipoBono() {
            val descuento = descuentoTipoBono(1)
            assertEquals(0.4, descuento, "El descuento debe ser 0.4")
        }

    @Test
    fun facturaAgua() {
        val factura = facturaAgua("Mensaje", 100.0, 0.4)
        assertEquals("Mensaje 60.0€, se le ha descontado 40.0€ y la cuota fija es de 6.0€", "La factura del agua debe ser 'Mensaje 60.0€, se le ha descontado 40.0€ y la cuota fija es de 6.0€'")
    }
}



