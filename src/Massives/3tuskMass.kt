package Massives

fun main() {

    val alphabet = charArrayOf(
        'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
        'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
        'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
        'Ь', 'Ы', 'Ъ', 'Э', 'Ю', 'Я'
    )


    println("Введите ключевое слово:")
    val key = readLine()!!.toUpperCase()
    println("Введите исходное сообщение:")
    val message = readLine()!!.toUpperCase()


    val encryptedMessage = encryptMessage(message, key, alphabet)


    println("Зашифрованное сообщение: $encryptedMessage")
}

// Функция для шифрования сообщения
fun encryptMessage(message: String, key: String, alphabet: CharArray): String {
    val result = StringBuilder()
    val keyLength = key.length

    for (i in message.indices) {
        val char = message[i]

        // Проверяем, является ли символ буквой русского алфавита
        if (char in alphabet) {
            // Находим индекс буквы в алфавите
            val alphabetIndex = alphabet.indexOf(char)

            // Получаем сдвиг из ключевого слова
            // Смещения относительно индекса ключа
            val shift = alphabet.indexOf(key[i % keyLength])
            // Новый индекс с учетом закольцованного массива
            val newIndex = (alphabetIndex + shift) % alphabet.size

            // Добавляем зашифрованный символ в результат
            result.append(alphabet[newIndex])
        } else {
            // Если не буква, добавляем символ без изменений
            result.append(char)
        }
    }

    return result.toString()
}