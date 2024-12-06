package cond.ex;

public class CondEx4 {
    public static void main(String[] args) {
        double rating=8;
        if(rating<7.0){
            System.out.println("추천할 영화가 없다.");
        }else if (rating<8.0){
            System.out.println("고질라 추천");
        }
    }
}
