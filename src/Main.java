public class Main {

    public static void main(String[] args) {
        System.out.println("\nTask 1");
        int money = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i++;
            total = total + money;
            total += total / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
        System.out.println("\nTask 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.print("\n");
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 3");
        double populationAmount = 12_000_000;
        double birthRate = 17.0 / 1000;
        double mortalityRate = 8.0 / 1000;
        int year = 0;
        while (year < 10) {
            double birthsPerYear = populationAmount * birthRate;
            double deathsPerYear = populationAmount * mortalityRate;
            populationAmount = populationAmount + birthsPerYear - deathsPerYear;
            year++;
            System.out.println("Год " + year + " численность населения составляет " + populationAmount);
        }
        System.out.println("\nTask 4 and 5");
        int contributionPerMonth = 15000;
        int account = 0;

        for (int j = 0; account <= 12_000_000; j++) {
            account = account + contributionPerMonth;
            account = account + (account / 100 * 7);
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ", сумма накоплений равна " + account);
            }
        }
        System.out.println(account);
        System.out.println("\nTask 6");
        account = 0;
        for (int j = 1; j <= 12 * 9; j++) {
            account = account + account / 100 * 7;
            account = account + contributionPerMonth;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ", сумма накоплений равна " + account);
            }
        }
        System.out.println("\nTask 7");
        int friday = 5;
        for (int dayNumber = friday; dayNumber <= 31; dayNumber += 7) {

            System.out.println("Сегодня пятница, " + dayNumber + "...-е число. Необходимо подготовить отчет");

        }
        System.out.println("\nTask 8");
        year = 0;
        int nowYear = 2024;
        for (int j = year; j <= nowYear + 100; j = j + 79) {
            if (j > nowYear - 200){
                System.out.println(j);
            }

        }


    }


}



