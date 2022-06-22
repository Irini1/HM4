public class Main {
    public static void main(String[] args) {
        int currentNum = 0;
        while (currentNum < 10) {
            System.out.print(++currentNum  + "");
        }
        System.out.println();

        for (; currentNum > 0; currentNum-- ) {
            System.out.print(currentNum + "");
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