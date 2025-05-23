Класс `<span class="code-inline__content">IntegerParser</span>` преобразует строку в целое число. Строку на вход передают пользователи, а это всегда риск некорректного ввода данных. Исключения будут генерироваться в методе `<span class="code-inline__content">parseInt()</span>`.

Важно обработать все исключения так, чтобы в случае, если они произойдут, пользователи увидели сообщения, с помощью которых могут исправить допущенную ошибку ввода. Для каждого типа исключений должен быть настроен свой вывод.

1. `<span class="code-inline__content">NullStringException</span>` и `<span class="code-inline__content">EmptyStringException</span>` — `<span class="code-inline__content">"Введена пустая строка."</span>`
2. `<span class="code-inline__content">StringNotNumberException</span>` — `<span class="code-inline__content">"Вы ввели не целое число."</span>`
3. `<span class="code-inline__content">StringIsTooBigNumberException</span>` — `<span class="code-inline__content">"Введённое число слишком большое."</span>`
4. `<span class="code-inline__content">StringIsTooSmallNumberException</span>` — `<span class="code-inline__content">"Введённое число слишком маленькое."</span>`

Р. S. Часть кода, необходимого для запуска программы, специально скрыта от вас, чтобы не отвлекать от выполнения задания.
