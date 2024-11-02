import java.time.LocalDate;

public class Main {
    // Задание 1
    public static boolean checkIsYearLeap(int year) {
        boolean checkYear = year >= 1584;
        boolean checkYear1 = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        return checkYear && checkYear1;
    }
    public static void printIsYearLeap(int year,boolean yearISLeap) {
                if (yearISLeap) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
    }
    // Задание 2
    public static void checkOSAndYear(int clientOS,int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию для приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию для приложения для Android по ссылке");
            }
        }
    }
    // Задание 3
    public static int deliveryTimeCalculator(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 100 || deliveryDistance < 0) {
            throw new RuntimeException("Доставка невозможна");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryTime = deliveryTime + 1;
            }
            if (deliveryDistance > 60) {
                deliveryTime = deliveryTime + 2;
            }
            return deliveryTime;
    }
    public static void main(String[] args) {
        // Задание 1
        int year = 1584;
        checkIsYearLeap(year);
        printIsYearLeap(year, checkIsYearLeap(year));
        // Задание 2
        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        checkOSAndYear(clientOS,currentYear);
        // Задание 3
        int deliveryDistance = 20;
        System.out.println("Потребуется дней : " + deliveryTimeCalculator(deliveryDistance));
    }
}
