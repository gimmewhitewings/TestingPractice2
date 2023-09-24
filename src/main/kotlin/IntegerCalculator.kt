/**
 * Простой класс для выполнения базовых арифметических операций над целыми числами
 * @param initialValue опциональный параметр конструктора для установки начального значения. По умолчанию равен 0
 * @property currentValue хранит текущее значение
 */
class IntegerCalculator(initialValue: Int = 0) {
    var currentValue: Int = 0

    init {
        currentValue = initialValue
    }

    /**
     * Функция сложения
     *
     * @param number слагаемое, прибавляемое к [currentValue]
     */
    fun add(number: Int) {
        currentValue += number
    }

    /**
     * Функция вычитания
     *
     * @param number вычитаемое из [currentValue] значение
     */
    fun subtract(number: Int) {
        currentValue -= number
    }

    /**
     * Функция деления
     *
     * @param number делитель для [currentValue]. Не может быть равно нулю, это вызовет [IllegalArgumentException]
     * @throws IllegalArgumentException
     */
    fun divide(number: Int) {
        if (number == 0) throw IllegalArgumentException("Division by zero isn't allowed")
        currentValue /= number
    }

    /**
     * Функция умножения
     *
     * @param number множитель для [currentValue]
     */
    fun multiply(number: Int) {
        currentValue *= number
    }
}