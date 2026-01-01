import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            for (int i = a + 1; i < b; i++) {
               if(i % 2 != 0) {
                System.out.println(i);
              }
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

