package array.Ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i=0;i<5;i++){
            numbers[i]=scanner.nextInt();
        }
        System.out.println("출력");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
            if(i<numbers.length-1){
                System.out.print(", ");
            }

        }
    }
}
