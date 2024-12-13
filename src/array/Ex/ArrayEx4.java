package array.Ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 갯수 입력 : ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        System.out.println(count+"개의 정수 입력:");
        for(int i=0;i<count;i++){
            numbers[i]=scanner.nextInt();
        }
        int minVal=numbers[0];
        int maxVal=numbers[0];
        for(int i=1;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>maxVal){
                maxVal=numbers[i];
            }
            if(numbers[i]<minVal){
                minVal = numbers[i];
            }
        }
        System.out.println("min = " + minVal);
        System.out.println("max = " + maxVal);
    }
}
