import java.util.*

/**
 * Класс для различных манипуляций над строкой
 *
 *
 * @param initialString опциональный параметр начального значения. По умолчанию равен пустой строке
 * @property currentString текущее значение строки. По умолчанию равно пустой строке
 */
class StringManipulator(initialString: String = "") {
    var currentString = ""

    init {
        currentString = initialString
    }

    /**
     * Умножение строки
     *
     * @param number множитель для строки. Конечная строка будет иметь вид [currentString] *  [number]
     * @throws IllegalArgumentException если [number] < 0
     */
    fun multiply(number: Int) {
        if (number < 0) throw IllegalArgumentException("You can not multiply string by negative number")
        if (number == 0) {
            currentString = ""
        } else {
            repeat(number - 1) {
                currentString += currentString
            }
        }
    }

    /**
     * Делает первую букву строки заглавной
     *
     */
    fun capitalize() {
        currentString =
            currentString.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }

    /**
     * Получение длины текущей строки
     *
     * @return длина текущей строки [currentString]
     */
    fun getCurrentStringLength(): Int = currentString.length

    /**
     * Удаляет указанный символ из строки
     *
     * @param char символ, который необходимо удалить
     */
    fun removeCharacter(char: Char) {
        currentString = currentString.filterNot { it == char }
    }

    /**
     * Делает все буквы [currentString] заглавными
     *
     */
    fun uppercase() {
        currentString = currentString.uppercase()
    }

    /**
     * Делает все буквы [currentString] строчными (маленькими)
     *
     */
    fun lowercase() {
        currentString = currentString.lowercase()
    }
}