package scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();
        int endNum = scanner.nextInt();

        for(int i = startNum;i<=endNum;i++){
            System.out.println("i = "+i);
        }
    }
}
