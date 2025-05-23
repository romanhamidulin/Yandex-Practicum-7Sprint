package ru.yandex.practicum.finallyexception;

public interface Validator {
    void validate(String value) throws ValidateException;
}
