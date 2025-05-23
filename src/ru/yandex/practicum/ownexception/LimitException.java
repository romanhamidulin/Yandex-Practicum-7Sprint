package ru.yandex.practicum.ownexception;

public class LimitException extends RuntimeException{
    int attempts;
    public LimitException(String s, int attempts) {
        super(s);
        this.attempts = attempts;
    }
    public String getDetailMessage() {
        return getMessage() + ": " + attempts;
    }
}

