package cond.ex;

public class CondEx5 {
    public static void main(String[] args) {
        String grade = "A";
        
        switch (grade){
            case "A":
                System.out.println("탁원한 성과입니다!");
            case "B":
                System.out.println("좋은 성과입니다.!");
            case "C":
                System.out.println("준수한 성과입니다!");
            case "D":
                System.out.println("향상 필요!");
            case "F":
                System.out.println("불합격!");
            default:
                System.out.println("잘못된 학점!");
        }
    }
}
