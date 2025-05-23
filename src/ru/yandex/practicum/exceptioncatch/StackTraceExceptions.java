package ru.yandex.practicum.exceptioncatch;

import java.util.Scanner;

public class StackTraceExceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
        /*try {
            final int parsedValue = IntegerParser.parseInt(inputValue);
            System.out.println(parsedValue);
        } catch (NullStringException | EmptyStringException exception) {
            printException("Введена пустая строка.", exception);
        } catch (StringNotNumberException exception) {
            printException("Вы ввели не целое число.", exception);
        } catch (StringIsTooBigNumberException exception) {
            printException("Введённое число слишком большое.", exception);
        } catch (StringIsTooSmallNumberException exception) {
            printException("Введённое число слишком маленькое.", exception);
        }*/
    }

    private static void printException(final String message, final Throwable exception) {
        System.out.print(message + ": ");
        if (exception.getMessage() != null)
            System.out.print(exception.getMessage());
        else
            exception.printStackTrace();
    }
}
