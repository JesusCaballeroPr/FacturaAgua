# Cálculo de Factura de Agua

Este proyecto contiene un conjunto de funciones escritas en Kotlin que calculan la factura del agua basándose en los litros consumidos, el tipo de bono aplicable y el descuento correspondiente.

## Funciones

Las funciones principales son:

- `litrosConsumidos(mensaje: String)`: Esta función solicita al usuario que introduzca los litros de agua consumidos. Devuelve los litros consumidos como un valor `Double`.

- `consumoAguaPrecio(litros: Double)`: Esta función calcula el precio del agua consumida basándose en los litros consumidos. Devuelve el precio del agua como un valor `Double`.

- `menuTipoBono(mensaje: String)`: Esta función muestra un menú al usuario para seleccionar el tipo de bono. Devuelve el tipo de bono seleccionado por el usuario como un valor `Int`.

- `descuentoTipoBono(tipoBono: Int)`: Esta función calcula el descuento aplicable en función del tipo de bono seleccionado por el usuario. Devuelve el descuento aplicable como un valor `Double`.

- `facturaAgua(mensaje: String, consumoAgua: Double, descuentoTipoBono: Double)`: Esta función calcula la factura del agua. Devuelve la factura del agua como una cadena `String`.

## Pruebas Unitarias

Para cada una de las funciones, se deben crear pruebas unitarias para asegurar que funcionan como se espera. Aquí tienes un ejemplo de cómo podrían ser las pruebas unitarias para estas funciones:

```kotlin
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FuncionesOperacionalesKtTest {

    @Test
    fun litrosConsumidos() {
        val litros = litrosConsumidos("Prueba")
        assertEquals(50.0, litros, "Los litros consumidos deben ser 50.0")
    }

    @Test
    fun consumoAguaPrecio() {
        val precio = consumoAguaPrecio(100.0)
        assertEquals(21.0, precio, "El precio del agua debe ser 21.0")
    }

    @Test
    fun menuTipoBono() {
        val tipo = menuTipoBono("Prueba")
        assertEquals(1, tipo, "El tipo de bono debe ser 1")
    }

    @Test
    fun descuentoTipoBono() {
        val descuento = descuentoTipoBono(1)
        assertEquals(0.4, descuento, "El descuento debe ser 0.4")
    }

    @Test
    fun facturaAgua() {
        val factura = facturaAgua("Prueba", 100.0, 0.4)
        assertEquals("Prueba 60.0€, se le ha descontado 40.0€ y la cuota fija es de 6.0€",  "La factura del agua debe ser 'Prueba 60.0€, se le ha descontado 40.0€ y la cuota fija es de 6.0€'")
    }
}
