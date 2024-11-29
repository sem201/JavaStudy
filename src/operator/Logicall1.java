package operator;

public class Logicall1 {
    public static void main(String[] args) {
        System.out.println("&&: AND연산");
        System.out.println(true && true); // 참
        System.out.println(true && false); // 거짓

        System.out.println("|| : OR 연산");
        System.out.println(true || true);
        System.out.println(true || false); // 참

        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
