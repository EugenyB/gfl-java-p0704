import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Main2 main = new Main2();
        main.run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            for (int y = start; y <= end; y++) {
                count += friday13(y);
            }
        }
        System.out.println(count);
    }

    int friday13(int year) {
        int count = 0;
        for (int m = 1; m <= 12; m++) {
//            LocalDate date = LocalDate.of(year, m, 13);
//            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) count++;
            if (dayOfWeek(year, m) == 5) count++;
        }
        return count;
    }

    int dayOfWeek(int year, int month) {
        int count = (year - 1) * 365;
        count += (year - 1) / 4;
        count -= (year - 1) / 100;
        count += (year - 1) / 400;
        int[] m = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        //            31  28  31   30   31   30   31   31   30   31  30
        count += m[month - 1];
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            if (month > 2) count++;
        }
        count += 13;
        return count % 7;
    }
}
