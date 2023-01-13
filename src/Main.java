public class Main {
    public static void main(String[] args) {
       task1_3();
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
}