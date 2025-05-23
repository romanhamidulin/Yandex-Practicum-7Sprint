package ru.yandex.practicum.stringbuilder.task3;

public class Palindrome {
    public boolean isPalindromeWord(String str) {
        StringBuilder word = new StringBuilder(str);
        return str.equals(word.reverse().toString());
    }
}
