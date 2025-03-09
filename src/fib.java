import java.util.Scanner;

class fib {
    static void F(int N) {
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < N; i++) {
            System.out.println(num1 + " ");

            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci Number: ");
        int N = scanner.nextInt();
        F(N);
  }
}
