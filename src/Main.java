import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задание №1");
        int clientOs = ThreadLocalRandom.current().nextInt(0,2);
        switch (clientOs) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задание №2");
        int clientOs = ThreadLocalRandom.current().nextInt(0,2);
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание №3");
        System.out.println("Введите год!");
        Scanner curentYear = new Scanner(System.in);
        int year = curentYear.nextInt();
        if (year < 100 && year % 100 == 0) {
            System.out.println("Этот год високосный");
        } else if (year >= 100 && year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0) {
                System.out.println("Этот год високосный");
            } else if (year % 100 != 0) {
                System.out.println("Этот год високосный");
            } else {
                System.out.println("Этот год невисокосный");
            }
        } else {
            System.out.println("Этот год невисокосный");
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задание №4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays+1));
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryDays+2));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задание №5");
        int monthNumber = 12;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Это месяц январь. Он принадлежит сезону зима.");
                    break;
                case 2:
                    System.out.println("Это месяц февраль. Он принадлежит сезону зима.");
                    break;
                case 3:
                    System.out.println("Это месяц март. Он принадлежит сезону весна.");
                    break;
                case 4:
                    System.out.println("Это месяц апрель. Он принадлежит сезону весна.");
                    break;
                case 5:
                    System.out.println("Это месяц май. Он принадлежит сезону весна.");
                    break;
                case 6:
                    System.out.println("Это месяц июнь. Он принадлежит сезону лето.");
                    break;
                case 7:
                    System.out.println("Это месяц июль. Он принадлежит сезону лето.");
                    break;
                case 8:
                    System.out.println("Это месяц август. Он принадлежит сезону лето.");
                    break;
                case 9:
                    System.out.println("Это месяц сентябрь. Он принадлежит сезону осень.");
                    break;
                case 10:
                    System.out.println("Это месяц октябрь. Он принадлежит сезону осень.");
                    break;
                case 11:
                    System.out.println("Это месяц ноябрь. Он принадлежит сезону осень.");
                    break;
                case 12:
                    System.out.println("Это месяц декабрь. Он принадлежит сезону зима.");
                    break;
            }
        } else {
            System.out.println("Вы указали некорректный номер месяца.");
        }
    }





}