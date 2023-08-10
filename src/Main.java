public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        int year = 2023;
        if(determineHeightYear(year)){

        } else{
            System.out.println(year+" год не является високосным");
        }
    }
    public static boolean determineHeightYear(int heightYear){
        boolean resultHeightYear=(heightYear % 4 ==0 && heightYear % 100 != 0) || heightYear % 400 ==0;
        return resultHeightYear;
    }

    public static void task2() {
        byte clientOS = 0;
        int clientDeviceYear = 2015;
        printYearOS(clientDeviceYear,clientOS);

    }
    public static void printYearOS(int clientDeviceYear,int clientOS){
        int currentYear = 2023;
        if (clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clientDeviceYear < currentYear && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }
    }

    public static void task3() {
        short deliveryDistance = 195;
        int dayDelivery=convertDistanceDayDelivery(deliveryDistance);
        if(dayDelivery==0){
            System.out.println("нет доставки");
        }else {
            System.out.println("Доставка занимает "+dayDelivery+" день");
        }

    }
    public static int convertDistanceDayDelivery(int distance){
        int dayDelivery=1;
        if(distance <= 20){
        } else if (distance <= 60){
            dayDelivery=dayDelivery+1;
        } else if (distance <= 100){
            dayDelivery=dayDelivery+2;
        } else {
            dayDelivery=0;
        }
        return dayDelivery;
    }
}