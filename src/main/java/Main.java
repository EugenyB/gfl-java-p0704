import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fib = new long[n + 1];
        long f = fib(n);
        System.out.println(f);
    }

    private long fib(int n) {
        if (n < 2) return n;
        if (fib[n] != 0) return fib[n];
        return fib[n] = fib(n - 1) + fib(n - 2);
    }

    long[] fib;
}


// 0 1 1 2 3 5 8 13 21 34

//      1
//     1  1
//    1  2 1
//   1 3  3 1
//  1 4  6  4 1
// 1 5 10 10 5 1
