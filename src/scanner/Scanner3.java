package scanner;

import java.util.Scanner;
public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int big;
        if(num1==num2){
            System.out.println("같은숫자");
            return;
        }
        big=(num1 > num2) ? num1: num2;
        System.out.println(big);
    }
}
