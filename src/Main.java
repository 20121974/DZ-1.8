import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        printIsLeap(2022);
        printCalculateDeliveryDays (50);

    }
    public static void printIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }
    public static void printInstallationMessage(int os, int productionYear) {//Метод печати сообщения об установке
       if (!(os == 0 || os == 1)) {
            throw new RuntimeException("устройство не поддерживается");}
    choosingVersion (0, 2015);
    }

    public static void choosingVersion (int os, int productionYear){
        var currentYear = LocalDate.now().getYear();//Это приведет к запросу системных часов в часовом поясе по умолчанию для получения текущей даты.

        String versionMassage = productionYear < currentYear ? "облегченную": " ";
        String osMassage = os == 0 ? "iOS" : "android";
        System.out.printf("Установите %s версию приложения для %s по ссылке", versionMassage, osMassage);
    }
    public static void printCalculateDeliveryDays(int distance) {
    int start = 20;
    int step = 40; //шаг
    int result = 1;
    if (distance >= start) {
        result = (Math.abs((distance - start) / step) + 2);
    }
        System.out.println("");
    System.out.println("Потребуется для доставки дней " + result);
    }
}


