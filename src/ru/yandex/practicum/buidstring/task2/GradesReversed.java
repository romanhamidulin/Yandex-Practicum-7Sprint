package ru.yandex.practicum.buidstring.task2;

public class GradesReversed {
    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        String[] strings;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < grades.length; i++) {
            strings = grades[i].split(" ");
            result.append(String.join(",", strings[0].toLowerCase(),
                    strings[1].toLowerCase(), strings[2].toUpperCase(),
                    gradeStringToInt(strings[4])));
            if (i != grades.length - 1)
                result.append(";");
        }
        return result.toString();
    }
}
