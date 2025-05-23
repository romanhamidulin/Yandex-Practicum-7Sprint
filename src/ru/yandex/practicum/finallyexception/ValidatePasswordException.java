package ru.yandex.practicum.finallyexception;

public class ValidatePasswordException extends ValidateException {
    public ValidatePasswordException(final String message) {
        super(message);
    }
}
