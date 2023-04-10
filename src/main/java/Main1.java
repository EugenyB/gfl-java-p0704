import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Main1 main = new Main1();
        main.run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        // 1 2 3

        // 1 3 2
        // 2 1 3
        // 2 3 1
        // 3 1 2
        // 3 2 1

        // 1 2 3 8 4 5 6 7
        // 1 2 3 8 4 5 7 6
        // 1 2 3 8 4 6 5 7
        // 1 2 3 8 4 7 5 6
        // ...
        // 1 2 3 8 7 6 5 4
        // 1 2 4 3 5 6 7 8

        // 1 2 4 8 7 6 5 3
    }
}
