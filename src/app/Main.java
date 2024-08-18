package app;

import java.util.Arrays;

public class Main {

    static int[] numbers;
    static int negativeNumbersSum;
    static int evenCount;
    static int oddCount;
    static int count;
    static int maxNumElement;
    static int maxNumIndex;
    static int minNumElement;
    static int minNumIndex;
    static boolean hasNegativeNumbers;
    static double averageAfterFirstNegative;
    static int sumAfterFirstNegative;
    static int countAfterFirstNegative;

    public static void main(String[] args) {
        numbers = new int[] {12, 45, 23, -85, 43, 7, 78, 34, -3, 81, 12, 82, -56, 34, 89, 12, -45, 67, -32, 7};

        count = 0;
        negativeNumbersSum = 0;
        evenCount = 0;
        oddCount = 0;
        maxNumElement = numbers[0];
        maxNumIndex = 0;
        minNumElement = numbers[0];
        minNumIndex = 0;
        hasNegativeNumbers = false;
        sumAfterFirstNegative = 0;
        countAfterFirstNegative = 0;
        averageAfterFirstNegative = 0;

        for (int num: numbers) {
            if (num < 0) {
                negativeNumbersSum += num;
            }

            if ( num % 2 == 0 ) {
                evenCount++;
            }

            if ( num % 2 != 0 ) {
                oddCount++;
            }

            if (num > maxNumElement) {
                maxNumElement = num;
                maxNumIndex = count;
            }

            if (num < minNumElement) {
                minNumElement = num;
                minNumIndex = count;
            }

            if (hasNegativeNumbers) {
                sumAfterFirstNegative += num;
                countAfterFirstNegative++;
            }

            if (!hasNegativeNumbers && num < 0) {
                hasNegativeNumbers = true;
            }

            count++;
        }

        if (countAfterFirstNegative > 0) {
            averageAfterFirstNegative = (double) sumAfterFirstNegative / countAfterFirstNegative;
        }

        System.out.println("Елементи масиву: " + Arrays.toString(numbers));
        System.out.println("Сума від'ємних чисел: " + negativeNumbersSum);
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
        System.out.println(
            "Найменший елемент: " + minNumElement + " (з індексом " + minNumIndex + ")"
        );
        System.out.println(
            "Найбільший елемент: " + maxNumElement + " (з індексом " + maxNumIndex + ")"
        );
        if (hasNegativeNumbers) {
            System.out.printf(
               "Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", averageAfterFirstNegative
            );
        } else {
            System.out.println("Не знайдено від'ємних чисел");
        }
    }
}
