import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Main3 main = new Main3();
        main.run();
    }

    private void run() {
        // 3
        // 0 0 0  []
        // 0 0 1  [0]
        // 0 1 0  [1]
        // 0 1 1  [0,1]
        // 1 0 0  [2]
        // 1 0 1  [0,2]
        // 1 1 0  [1,2]
        // 1 1 1  [0,1,2]
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = 1 << k;
        for (int i = 0; i < n; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
