public class Main {
    public static void main(String[] args) {
       task1_3();
       task4_8();
    }
    static void task1_3(){
        System.out.println("Task 1");
        int total = 0;
        int money = 15000;
        int countMonth = 0;
        while (total < 2_459_000){
            total += money;
            countMonth++;
        }
        System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + total + " рублей");
        System.out.println("Task 2");
        int j = 1;
        while (j <= 10){
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 3");
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (int i = 1; i < 11; i++){
            population += population / 1000 * birthRate - population / 1000 * mortality;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }
    public static void task4_8(){
        System.out.println("Task 4");
        int contribution = 15_000;
        int countMonth = 0;
        while (contribution < 12_000_000){
            contribution += contribution / 100 * 7;
            countMonth++;
            System.out.println("Месяц " + countMonth + ", сумма накоплений " + contribution + " рублей");
        }
        System.out.println("Task 5");
        contribution = 15_000;
        countMonth = 0;
        while (contribution < 12_000_000){
            contribution += contribution / 100 * 7;
            countMonth++;
            if (countMonth % 6 == 0){
                System.out.println("Месяц " + countMonth + ", сумма накоплений " + contribution + " рублей");
        }
        }
        System.out.println("Месяц " + countMonth + ", сумма накоплений " + contribution + " рублей");
        System.out.println("Task 6");
        contribution = 15_000;
        for (countMonth = 0; countMonth <= 9 * 12; countMonth++){
            contribution += contribution / 100 * 7;
            if (countMonth % 6 == 0){
                System.out.println("Месяц " + countMonth + ", сумма накоплений " + contribution + " рублей");
            }
        }
        System.out.println("Task 7");
        int date = 3;
        for (; date <= 31; date += 7){
            System.out.println("Сегодня пятница, " + date + "-ое число. Необходмио подготовить отчет");
        }
        System.out.println("Task 8");
        int ourAge = 2023;
        int beforeOurAge = ourAge - 200;
        int afterOurAge = ourAge + 100;
        for (int i = beforeOurAge + (79- beforeOurAge % 79); i <= afterOurAge; i += 79){
            System.out.println(i);
        }

    }
}