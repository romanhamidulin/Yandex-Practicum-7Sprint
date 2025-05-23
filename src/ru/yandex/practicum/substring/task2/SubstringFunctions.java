package ru.yandex.practicum.substring.task2;

public class SubstringFunctions {
    public boolean endsWith(String initial, String other) {
        int otherLength = other.length();
        int entry =  initial.lastIndexOf(other);
        int initialLength = initial.length();
        return initialLength - otherLength == entry;
    }
}