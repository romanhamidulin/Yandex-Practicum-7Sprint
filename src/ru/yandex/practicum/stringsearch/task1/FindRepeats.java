package ru.yandex.practicum.stringsearch.task1;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        while (text.contains(substring))
        {
            count++;
            text = text.substring(text.indexOf(substring) + substring.length());
        }
        return count;
    }
}
