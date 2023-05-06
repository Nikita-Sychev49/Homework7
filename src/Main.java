public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int investion = 15_000;
        int sum = 0;
        int month = 1;
        while (sum <= 2_459_000) {
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
            month++;
            sum = sum + investion;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(" " + a);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPeople = 12_000_000;
        int countBirth = 17;
        int countMortality = 8;
        for (int i = 1; i <= 10; i++) {
            int thousandPeople = totalPeople / 1000;
            int everyYearBirth = countBirth * thousandPeople;
            int everyYearMortality = countMortality * thousandPeople;
            int differenceBirthAndMortality = everyYearBirth - everyYearMortality;
            totalPeople = totalPeople + differenceBirthAndMortality;
            System.out.println("Год " + i + " численность населения составляет " + totalPeople);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int investion = 15_000;
        int total = 0;
        int month = 1;
        while (investion <= 12_000_000) {
            total = investion * 7 / 100;
            investion = total + investion;
            System.out.println("В месяце " + month + " сумма накопления составляет " + investion + " рублей");
            month++;
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int investion = 15_000;
        int total = 0;
        int month = 1;
        while (investion <= 12_000_000) {
            total = investion * 7 / 100;
            investion = total + investion;
            if (month % 6 == 0) {
                System.out.println("В месяце " + month + " сумма накопления составляет " + investion + " рублей");
            }
            month++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int investion = 15_000;
        int total = 0;
        int month = 1;
        int nineYear = 9 * 12;
        while (month <= nineYear) {
            total = investion * 7 / 100;
            investion = total + investion;
            if (month % 6 == 0) {
                System.out.println("В месяце " + month + " сумма накопления составляет " + investion + " рублей");
            }
            month++;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int month = 31;
        int friday = 5;
        while (friday <= month) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int startYear = 2023 - 200;
        int endYear = 2023 + 100;
        for (int i = startYear; i < endYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}




