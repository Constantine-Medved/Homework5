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
    }
    public static void task4() {
        System.out.println("Задача 4.");
    }
    public static void task5() {
        System.out.println("Задача 5.");
    }
}
