public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1.");
        char clientOS = '1';
        switch (clientOS) {
            case '1':
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
            case '0':
                System.out.println("Установите версию приложения для iOS по ссылке.");
                break;
            default:
                System.out.println("Сожалеем, Ваша опереционная система не поддерживается. Подерживаемые ОС: iOS и Android.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2.");
        char clientOS = '0';
        int clientDeviceYear = 2014;
        switch (clientOS) {
            case '1':
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке.");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                }
                break;
            case '0':
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                }
                break;
            default:
                System.out.println("Сожалеем, Ваша опереционная система не поддерживается. Подерживаемые ОС: iOS и Android.");
        }
    }
    public static void task3() {
        System.out.println("Задача 3.");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4.");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = deliveryDays * 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays * 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5.");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Зимний месяц.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}
