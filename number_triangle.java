import java.util.Scanner;

public class number_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number - ");
        int n = sc.nextInt();

        for (int i = 1, v = 1; i <= n; i++) {
            for (int j = i; j <= n; j++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++, v++)
                System.out.print(v + "   ");

            System.out.println();
        }
    }
}
