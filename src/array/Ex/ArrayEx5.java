package array.Ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][3];
        String[] subjects = {"국어","영어","수학"};
        int[] scores = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int n=0;n<4;n++){
            System.out.println((n+1)+"번 학생의 성적을 입력하세요: ");
            for (int l=0;l<3;l++){
                System.out.println(subjects[l]+" 점수");
                numbers[n][l] = scanner.nextInt();
                scores[n] += numbers[n][l];
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(i+"번 학생의 총점: ");
            System.out.print(scores[i]);
            System.out.println(", 평균: "+(double)scores[i]/3);
        }
    }
}
