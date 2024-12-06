package loop;

public class While1_3 {
    public static void main(String[] args) {
        int sum = 0;
        int num =1;
        while(num<4){
            sum += num;
            num++;
        }
        System.out.println("sum = " + sum);
    }
}
