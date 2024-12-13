package array.Ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students={90,80,70,60,50};
        int total =0;
        for(int student:students){
            total +=student;
        }
        System.out.println((double)total/students.length);
    }
}
