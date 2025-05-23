Приложения часто должны обрабатывать и преобразовывать данные, которые поступили от пользователей. Важно уметь обрабатывать ошибки при вводе и уметь ограничивать количество попыток, в том числе и с помощью написания собственных классов-исключений.

Перед вами программа-калькулятор сложных процентов. Допишите код классов-исключений `<span class="code-inline__content">LimitException</span>` (для ограничения количества попыток) и `<span class="code-inline__content">InputException</span>` (для ошибок при вводе), а также добавьте их обработку.

1. Исключение `<span class="code-inline__content">LimitException</span>` должно быть унаследовано от класса `<span class="code-inline__content">RuntimeException</span>`. Помимо текста исключения оно должно принимать количество попыток ввода `<span class="code-inline__content">attempts</span>` в виде целого числа.
2. Добавьте обработку `<span class="code-inline__content">LimitException</span>` в методе `<span class="code-inline__content">main()</span>`. При превышении лимита попыток предусмотрите вывод сообщения: `<span class="code-inline__content">Превышен лимит ошибок ввода: n</span>`, где `<span class="code-inline__content">n</span>` — количество реальных попыток.
3. Исключение `<span class="code-inline__content">InputException</span>` должно быть унаследовано от класса `<span class="code-inline__content">Exception</span>`. При обработке ошибки предусмотрите вывод для пользователей следующих сообщений:
   * Введено отрицательное значение;
   * Введено не число;
   * Ошибка ввода: <подробное сообщение об ошибке>.
4. Сгенерируйте нужные исключения внутри класса `<span class="code-inline__content">FinancialCalculatorException</span>`.
