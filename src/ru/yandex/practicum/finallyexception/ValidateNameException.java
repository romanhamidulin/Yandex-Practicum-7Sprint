package ru.yandex.practicum.finallyexception;

public class ValidateNameException extends ValidateException {
    public ValidateNameException (final String message) {
        super(message);
    }
}
