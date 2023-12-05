import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {

        System.out.println();
        System.out.println("Задача 1");

        int year = 2021;
        checkToLeapYear(year);
    }

    public static void task2() {

        System.out.println();
        System.out.println("Задача 2");

        byte clientOS = 1; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2015;
        String message = identifyMessages(clientOS, clientDeviceYear);
        System.out.println(message);
    }

    public static void task3() {

        System.out.println();
        System.out.println("Задача 3");

        int deliveryDistance = 95;
        int deliveryDay = calculateDay(deliveryDistance);

        if (deliveryDay == 0) {
            System.out.println("Свыше 100 км доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDay);
        }
    }

    public static void checkToLeapYear(int year) {

        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static String identifyMessages(byte clientOS, int clientDeviceYear) {

        String message;
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0) {
            message = clientDeviceYear < currentYear ? "Установите облегченную версию приложения для IOS по ссылке" : "Установите версию приложения для IOS по ссылке";
        } else {
            message = clientDeviceYear < currentYear ? "Установите облегченную версию приложения для Android по ссылке" : "Установите версию приложения для Android по ссылке";
        }
        return message;
    }

    public static int calculateDay(int deliveryDistance) {

        int day = 0;
        if (deliveryDistance <= 20) {
            day = 1;
        } else if (deliveryDistance <= 60) {
            day = 2;
        } else if (deliveryDistance <= 100) {
            day = 3;
        }

        return day;
    }
}