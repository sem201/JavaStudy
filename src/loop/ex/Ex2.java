package loop.ex;

public class Ex2 {
    public static void main(String[] args) {
        int cnt=1;
        for(int num=1;;num++){
            if(num%2==0){
                System.out.println(num);
                cnt++;
            }
            if(cnt==11){
                break;
            }

        }
    }
}
