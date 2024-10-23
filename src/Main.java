public class Main {
    public static void main(String[] args) {

        int clientOS = 1;// Вписать 1 или 0 в зависимости от ОС//
        int iOS = 0;
        int android = 1;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientOS1 = 1;//вписать 1 или 0 в зависимости от ОС//
        int clientDeviceYear = 2009;
        int iOS1 = 0;
        int android1 = 1;
        if (clientOS1 == iOS1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == iOS1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == android1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        int year = 1853;// Вписать нужный год не раньше 1855 г.//
        if (year <= 1854) {
            System.out.println(" Год не может быть меньше или равным 1854 г.");
        }
        if (year > 1854) {
            if ((year % 4 == 0) || (year % 100 != 0 && year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

        int deliveryDistanceKm = 105;//Ввести растояние в километрах//
        if (deliveryDistanceKm < 20) {
            System.out.println("Потребуется 1 день на доставку");
        }
        if (deliveryDistanceKm >= 20 && deliveryDistanceKm < 60) {
            System.out.println("Потребуется 2 дня на доставку");
        }
        if (deliveryDistanceKm >= 60 && deliveryDistanceKm < 100) {
            System.out.println("Потребуется 3 дня на доставку");
        } else {
            System.out.println("Доставка не производится");
        }


        int monthNumber = 15;//Введите порядковый номер месяца//
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");


        }


    }

}