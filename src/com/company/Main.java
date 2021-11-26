package com.company;

public class Main {

    public static void main(String[] args) {
	task1();
    task2();
    task3();
    task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
//        int[] arr = {1,1,1,3,10};
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int j : arr) {
            summ += j;
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");
    }

    public static void task2() {
//        int[] arr = {1,1,1,3,10};
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");
    }

    public static void task3() {
//        int[] arr = {1,1,1,3,10};
        int[] arr = generateRandomArray();
        int summ = 0;
        float average;
        for (int j : arr) {
            summ += j;
        }
        average = (float) summ / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
