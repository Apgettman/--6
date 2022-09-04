public class Main {
    public static void main(String[] args) {
        // Условный оператор, урок 2
        // Задание 1
        int clientOS = 0;
        int clientAN = 1;
        if (true) {
            System.out.println("Установите версию приложения для iOS по ссылке!");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке!");
        }
        // Задание 2
        int clientDeviceYear = 2020;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке!");
            } else {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке!");
                }
                // Задание 3
                int yearV = 2020;
                int year = 2021;
                System.out.println(yearV + " год является високосным!");
                if (year >= 2021) ;
                System.out.println(year + " год не является високосным!");
            }
            // Задание 4
            int deliveryDistance = 95;
            int days = 1;
            if (deliveryDistance > 20) {
                days++;
            }
            if (deliveryDistance > 60) {
                days++;
            }
                System.out.println("Потребуется дней: " + days + "!");
            }
            // Задание 5
            int monthNumber = 8;
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь - принадлежит к сезону зима!");
                    break;
                case 2:
                    System.out.println("Февраль - принадлежит к сезону зима!");
                    break;
                case 3:
                    System.out.println("Март - принадлежит к сезону весна!");
                    break;
                case 4:
                    System.out.println("Апрель - принадлежит к сезону весна!");
                    break;
                case 5:
                    System.out.println("Май - принадлежит к сезону весна!");
                    break;
                case 6:
                    System.out.println("Июнь - принадлежит к сезону лето!");
                    break;
                case 7:
                    System.out.println("Июль - принадлежит к сезону лето");
                    break;
                case 8:
                    System.out.println("Август - принадлежит к сезону лето!");
                    break;
                case 9:
                    System.out.println("Сентябрь - принадлежит к сезону осень!");
                    break;
                case 10:
                    System.out.println("Октябрь - принадлежит к сезону осень!");
                    break;
                case 11:
                    System.out.println("Ноябрь - принадлежит к сезону осень!");
                    break;
                case 12:
                    System.out.println("Декабрь - принадлежит к сезону зима!");
                    break;
                default:
                    System.out.println("Такого месяца не существует!");
            }
        }
    }