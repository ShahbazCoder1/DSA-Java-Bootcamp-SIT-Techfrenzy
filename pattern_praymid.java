import java.util.Scanner;

public class pattern_praymid {
    public void printTriangle(int n) {
        int num = 1, i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pattern_praymid obj = new pattern_praymid();
        System.out.println("Enter the Inverted Praymid size: ");
        int n = sc.nextInt();
        obj.printTriangle(n);
    }
}