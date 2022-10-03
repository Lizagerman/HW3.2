public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 3.2");

        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");
        int clientDeviceYear;
        clientDeviceYear = 0;
        clientDeviceYear = 2015;
        if (clientDeviceYear == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        System.out.println("Задание 3");
        boolean theYear2021IsDontALeapYear = true;
        int year = 2021;
        if (theYear2021IsDontALeapYear) {
            System.out.println(year + "год не является високосным");
        }

        


        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber ) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима.");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }
}
