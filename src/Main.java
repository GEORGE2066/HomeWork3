public class Main {
    public static void main(String[] args) {

        /*ПЕРВОЕ ЗАДАНИЕ*/

        byte os = 0;

        if (os == 0) {
            System.out.println("Установите приложение для iOS");
        } else {
            System.out.println("Установите приложение для Android");
        }


        /*ВТОРОЕ ЗАДАНИЕ*/

        int year = 2016;

        if (year >= 2015) {
            System.out.println("Приложение будет работать корректно");
        } else {
            if (os == 0) {
                System.out.println("Установите облегчённую версию приложения для iOS");
            } else {
                System.out.println("Установите облегчённую версию приложения для Android");
            }
        }


        /*ТРЕТЬЕ ЗАДАНИЕ*/

        int year2 = 2020;
        int leapYear = year2 % 4;

        if (leapYear > 0) {
            System.out.println("Год не является високосным");
        } else  {
            System.out.println("Год является високосным");
        }


        /*ЧЕТВЁРТОЕ ЗАДАНИЕ*/

        int distanceDelivery = 12;

        if (distanceDelivery < 20) {
            System.out.println("Время доставки занимает сутки");
        } else if (distanceDelivery >= 20 && distanceDelivery < 60) {
            System.out.println("Время доставки занимает 2-е суток");
        } else if (distanceDelivery >= 60 && distanceDelivery <= 100) {
            System.out.println("Время доставки занимает 3-е суток");
        }


        /*ПЯТОЕ ЗАДАНИЕ*/

        int month = 4;

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Это зимний месяц");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Это весенний месяц");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Это летний месяц");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Это осенний месяц");
                break;
        }
    }
}