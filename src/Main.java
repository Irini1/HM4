public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(" Цикл " + i);
        }

        for (int i = 0; i > 10; i++ ) {
            System.out.println("Цикл " + --i);
        }

        for (int b = 3; b < 31; b = b +7) {
            System.out.println("Сегодня пятница, " + b + " число.Необходимо подготовить отчёт");
        }

        int currentYear = 2022;
        int cometPeriod = 79;
        for (int i = 0; i < currentYear + cometPeriod; i += cometPeriod) {
            if (i > currentYear - 200) {
                System.out.println(i);
            }
        }
    }
}