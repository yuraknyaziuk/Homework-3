package com.company;

public class Main {

    public static void main(String[] args) {

        /*Заведите переменную month типа int и присвойте ей произвольное значение (от 1 до 12 - номера месяцев в году)
        С помощью конструкции if-else-if в зависимости от значения переменной выведите на консоль слово “Зима”, “Весна”, “Лето” или “Осень”
        Используя ту же переменную month с помощью конструкции switch выведите на консоль слово “Зима”, “Весна”, “Лето” или “Осень” (по сути то же самое, что и в задании 2)
        Создайте и проинициализируйте 1-мерный массив array длиной не менее 10 элементов (можно использовать упрощенный синтаксис)
        С помощью оператора for выведите массив array в обратном порядке (помните, что array.length - это длина массива).
        Создайте и проинициализируйте 2-мерный массив squareArray. Не используйте альтернативный синтаксис, т. е. инициализируйте каждый элемент по отдельности (например, squareArray[0][1] = 12; и т. д. каждый элемент)
        Выведите массив squareArray в консоль в виде таблицы. Рядом с каждым элементом массива выведите в квадратных скобках индексы строки и столбца (см. пример)
        Залейте проект на GitHub и ссылку на репозиторий отправьте преподавателю
*/

        int month = 13;

        System.out.println("Task if - else");
        System.out.println("");

        if (month < 3 || month == 12) {

            System.out.println("Winter");

        } else if (month > 2 && month < 6) {

            System.out.println("Autumn");

        } else if (month > 5 && month < 9) {

            System.out.println("Summer");

        } else if (month > 8 && month < 12) {

            System.out.println("Spring");

        } else {

            System.out.println("Error, seasons not found");

        }
        System.out.println("");
        System.out.println("Task SWITCH");
        System.out.println("");
        switch (month) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 12:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            case 4:
                System.out.println("Autumn");
                break;
            case 5:
                System.out.println("Autumn");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Spring");
                break;
            case 10:
                System.out.println("Spring");
                break;
            case 11:
                System.out.println("Spring");
                break;
            default:
                System.out.println("Error, seasons not found");

        }
        System.out.println("");
        System.out.println("Task array");
        System.out.println("");

        int[] array = {1, 13, 14, 14, 15, 24, 34, 54, 54, 98};

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + "\t");
        }
        System.out.println("");
        System.out.println("Task squareArray");
        System.out.println("");
        int p = 2;
        int o = p;

        int[][] squareArray = new int[p][o];
        squareArray[0][0] = 56;
        squareArray[0][1] = 45;
        squareArray[1][0] = 89;
        squareArray[1][1] = 321;

        for (int i = 0; i < p; i++) {

            for (int j = 0; j < o; j++) {

                System.out.print(squareArray[i][j] + "[" + i + "]" + "[" + j + "]" + "\t");

            }
            System.out.println("");
        }

        /*Реализовать расчет факториала для числа
        Написать программу, которая проверяет является ли число простым (если не помним, то гуглим, что такое простые и составные числа)
        Реализовать алгоритм “Решето Эратосфена” (примечание: возьмите конечную последовательность чисел - например, до 1000; используйте массивы)
        */
        System.out.println("");
        System.out.println("Task  factorial n");
        System.out.println("");
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {

            factorial = factorial * i;

        }
        System.out.println(factorial);
        System.out.println("");
        System.out.println("Task isPrime ");
        System.out.println("");

        int temp;
        boolean isPrime = true;
        int num = 3;


        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - составное число");
        }



    }


}
