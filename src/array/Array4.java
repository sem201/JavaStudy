package array;

public class Array4 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // 2차원 배열 선언
        
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;
        arr[1][2] = 1;


        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
            System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }
}
