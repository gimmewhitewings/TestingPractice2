import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith


class StringManipulatorTest {
    @Test
    fun multiply() {
        val manipulator = StringManipulator("ab")
        manipulator.multiply(2)
        assertEquals("abab", manipulator.currentString)
    }

    @Test
    fun `multiply by zero`() {
        val manipulator = StringManipulator("ab")
        manipulator.multiply(0)
        assertEquals("", manipulator.currentString)
    }

    @Test
    fun `multiply by negative`() {
        val manipulator = StringManipulator("dfb")
        assertFailsWith<IllegalArgumentException> { manipulator.multiply(-235) }
    }

    @Test
    fun capitalize() {
        val manipulator = StringManipulator("hello, world!")
        manipulator.capitalize()
        assertEquals("Hello, world!", manipulator.currentString)
    }

    @Test
    fun `current string length`() {
        val manipulator = StringManipulator("abcd")
        assertEquals(4, manipulator.getCurrentStringLength())
    }

    @Test
    fun `empty string length`() {
        val manipulator = StringManipulator()
        assertEquals(0, manipulator.getCurrentStringLength())
    }

    @Test
    fun `remove character`() {
        val manipulator = StringManipulator("abacadav")
        manipulator.removeCharacter('a')
        assertEquals("bcdv", manipulator.currentString)
    }

    @Test
    fun uppercase() {
        val manipulator = StringManipulator("AVaDGaVAdagd")
        manipulator.uppercase()
        assertEquals("AVADGAVADAGD", manipulator.currentString)
    }

    @Test
    fun lowercase() {
        val manipulator = StringManipulator("AVaDGaVAdagd")
        manipulator.lowercase()
        assertEquals("avadgavadagd", manipulator.currentString)
    }
}