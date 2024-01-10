import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FuncionesOperacionalesKtTest{
    @Test
    fun testLitrosConsumidos() {
        var litros = litrosConsumidos("¿Cuántos litros ha consumido?")
        assertTrue(litros is Double, "La función litrosConsumidos debería devolver un Double.")
    }

    @Test
    fun testMenuTipoBono() {
        var tipo = menuTipoBono("¿Tiene el descuento de familia numerosa (1) o un bono social (2)?")
        assertTrue(tipo is Int, "La función menuTipoBono debería devolver un Int.")
    }
    @Test
    fun testConsumoAguaPrecio() {
        assertEquals(6.0, consumoAguaPrecio(10.0), "El precio del agua para 10 litros debería ser 6.0")
        assertEquals(30.0, consumoAguaPrecio(200.0), "El precio del agua para 200 litros debería ser 30.0")
        assertEquals(60.0, consumoAguaPrecio(200.0), "El precio del agua para 201 litros debería ser 60.0")
    }
    @Test
    fun testDescuentoTipoBono() {
        assertEquals(0.0, descuentoTipoBono(1), "El descuento para una familia numerosa de una persona debería ser 0.0")
        assertEquals(0.2, descuentoTipoBono(1), "El descuento para una familia numerosa de dos personas debería ser 0.2")
        assertEquals(0.5, descuentoTipoBono(1), "El descuento para una familia numerosa de seis personas debería ser 0.5")
        assertEquals(0.8, descuentoTipoBono(2), "El descuento para un bono social debería ser 0.8")
    }

    @Test
    fun testFacturaAgua() {
        assertEquals("La factura total del agua será:  6.0, se le ha descontado 0.0 y la cuota fija es de 6.0", facturaAgua("La factura total del agua será: ", 10.0, 0.0), "La factura para 10 litros sin descuento debería ser 6.0")
    }
}

