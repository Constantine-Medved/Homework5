public class Main {
    public static void main(String[] args) {
        task1Version1();
        task1Version2();
        task2Version1();
        task2Version2();
        task3();
        task4();
        task5();
    }
    public static void task1Version1() {
        System.out.println("Задача 1. Вариант решения 1 (Switch)");
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
    public static void task1Version2() {
        System.out.println("Задача 1. Вариант решения 2 (Условный опереатор)");
        int clientOS = 1;
        if (clientOS ==1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS ==0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
                System.out.println("Сожалеем, Ваша опереционная система не поддерживается. Подерживаемые ОС: iOS и Android.");
        }
    }
    public static void task2Version1() {
        System.out.println("Задача 2. Вариант решения 1 (Switch)");
        char clientOS = '1';
        int clientDeviceYear = 2014;
        switch (clientOS) {
            case '1':
                    System.out.println((clientDeviceYear >= 2015)?"Установите версию приложения для Android по ссылке." : "Установите облегченную версию приложения для Android по ссылке.");
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
    public static void task2Version2() {
        System.out.println("Задача 2. Вариант решения 2 (Вложенный условный опереатор)");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else if (clientOS == 0) {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                }
        } else {
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
