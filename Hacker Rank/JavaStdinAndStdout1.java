package package3;

import java.util.Scanner;

public class JavaStdinAndStdout1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println(a);
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());

        scanner.close();
    }
}
