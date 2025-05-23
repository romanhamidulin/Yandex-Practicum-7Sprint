Команда Ctrl/Alt + F (⌘ + F для Mac) — пожалуй, самый известный пример организации поиска подстрок и символов внутри текста. При нажатии открывается небольшое окошко, куда вбивается текст, и в результате вы получаете количество повторов искомого текста или символа.

Попробуйте реализовать такой подсчёт на Java. Напишите метод `<span class="code-inline__content">int numberOfRepeats(String text, String substring)</span>`, который будет возвращать число повторения подстроки `<span class="code-inline__content">substring</span>` в переданном тексте `<span class="code-inline__content">text</span>`.

Пример:

Скопировать кодJAVA

```
numberOfRepeats("раз два три, раз два три", "раз"); // вернёт 2
numberOfRepeats("Hello, world!", "goodbye"); // вернёт 0 
```
