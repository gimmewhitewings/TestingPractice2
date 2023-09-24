import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class IntegerCalculatorTest {

    @Test
    fun addition() {
        val calculator = IntegerCalculator()
        calculator.add(5)
        assertEquals(5, calculator.currentValue)
    }

    @Test
    fun subtraction() {
        val calculator = IntegerCalculator()
        calculator.subtract(25)
        assertEquals(-25, calculator.currentValue)
    }

    @Test
    fun multiply() {
        val calculator = IntegerCalculator(5)
        calculator.multiply(7)
        assertEquals(35, calculator.currentValue)
    }

    @Test
    fun `multiply zero`() {
        val calculator = IntegerCalculator()
        calculator.multiply(1244)
        assertEquals(0, calculator.currentValue)
    }

    @Test
    fun divide() {
        val calculator = IntegerCalculator(38)
        calculator.divide(2)
        assertEquals(19, calculator.currentValue)
    }

    @Test
    fun `division by zero`() {
        val calculator = IntegerCalculator(242)
        assertFailsWith<IllegalArgumentException> { calculator.divide(0) }
    }

    @Test
    fun `multiple actions`() {
        val calculator = IntegerCalculator(0)
        calculator.apply {
            add(2)
            multiply(3)
            subtract(1)
            divide(5)
        }

        assertEquals(1, calculator.currentValue)
    }
}