package ru.yandex.practicum.buidstring.task1;

import java.util.Arrays;

public class Grades {
    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        // реализуйте метод здесь
        String[] grade = (grades.split(";"));
        for (int i = 0; i < grade.length; i++) {
            System.out.println(capitalize(grade[i].split(",")[0])+" "+capitalize(grade[i].split(",")[1])+" "
                    +grade[i].split(",")[2].toLowerCase()+" — "+gradeToString(grade[i].split(",")[3]));
        }
    }
}
