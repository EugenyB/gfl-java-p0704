import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Main4 main = new Main4();
        main.run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        p(n, 1, 2, 3);
    }

    private void p(int n, int from, int to, int aux) {
        if (n == 1) {
            System.out.println(from + " -> " + to);
        } else {
            p(n - 1, from, aux, to);
            p(1, from, to, aux);
            p(n - 1, aux, to, from);
        }
    }
}
