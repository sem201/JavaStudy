package array;

public class Array6 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
            {1,2,3},
            {4,5,6}
        };

        int[][] arr2 = {
                {1,2,3},
                {4,5,6}
        }; // 2차원 배열선언2



        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
            System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
