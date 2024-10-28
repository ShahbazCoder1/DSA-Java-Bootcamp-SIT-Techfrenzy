import java.util.Scanner;

public class lcm_gcd {
    public static int[] lcmAndGcd(int a, int b) {
        int gcd = findGcd(a, b);
        int lcm = (a * b) / gcd;

        int[] result = new int[2];
        result[0] = lcm;
        result[1] = gcd;

        return result;
    }

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for 'A': ");
        int a = sc.nextInt();
        System.out.println("Enter a number for 'b': ");
        int b = sc.nextInt();

        int[] result = lcmAndGcd(a, b);

        System.out.println("LCM: " + result[0]);
        System.out.println("GCD: " + result[1]);
    }
}
