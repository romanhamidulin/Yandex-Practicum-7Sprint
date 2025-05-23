Доработайте код приложения для хранения и обработки паролей пользователей.

1. По аналогии с классом `<span class="code-inline__content">ValidatePasswordException</span>` для ошибок при вводе пароля допишите код класса `<span class="code-inline__content">ValidateNameException</span>` для ошибок при вводе имени пользователя. Оба класса должны наследовать от `<span class="code-inline__content">ValidateException</span>` и принимать короткое сообщение об ошибке.
2. В методах класса `<span class="code-inline__content">PasswordMemoryStorage</span>` пропущены предупреждения об исключении `<span class="code-inline__content">IOException</span>` — добавьте их.
3. Допишите код класса `<span class="code-inline__content">NameValidator</span>` — он должен реализовывать интерфейс `<span class="code-inline__content">Validator</span>` и проверять, не передана ли пустая строка. В обратном случае — генерировать исключение `<span class="code-inline__content">ValidateNameException</span>` с сообщением «Имя не должно быть пустым».
4. Добавьте реализованный экземпляр класса `<span class="code-inline__content">NameValidator</span>` в список `<span class="code-inline__content">nameValidators</span>`.
5. Добавьте отлов исключений `<span class="code-inline__content">ValidateNameException</span>` и `<span class="code-inline__content">ValidatePasswordException</span>` в методы класса `<span class="code-inline__content">Practicum</span>`. При этом выведите сообщения формата:
   * Ошибка валидации имени: + короткое описание ошибки.
   * Ошибка валидации пароля: + короткое описание ошибки.
6. Организуйте закрытие хранилища `<span class="code-inline__content">storage</span>` при помощи метода `<span class="code-inline__content">close()</span>` при любом развитии событий в методах `<span class="code-inline__content">addUser()</span>` и `<span class="code-inline__content">showUserPassword()</span>` класса `<span class="code-inline__content">Practicum</span>`.
