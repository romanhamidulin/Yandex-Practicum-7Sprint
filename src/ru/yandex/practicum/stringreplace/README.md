Опечатки и орфографические ошибки — проклятье любых текстов. Бьёмся об заклад, в нашем курсе вам тоже попадались эти субъекты! Поэтому предлагаем вам реализовать программу автозамены. Она должна будет исправлять заранее известные недоработки в тексте.

Реализуйте метод  `<span class="code-inline__content">String fixText(String text)</span>`. Он должен:

* Исправлять кавычки `<span class="code-inline__content">"„"</span>` и `<span class="code-inline__content">"“"</span>` на `<span class="code-inline__content">"«"</span>` и`<span class="code-inline__content">"»"</span>`.
* Убирать опечатку в слове `<span class="code-inline__content">"цевилизаций"</span>` (на `<span class="code-inline__content">"цивилизаций"</span>`).
* Убирать лишние символы в начале и в конце строки.
* Начинать строку с большой буквы. Обратите внимание, мы уже добавили в код ранее написанный вами метод `<span class="code-inline__content">String capitalize(String str)</span>`.
