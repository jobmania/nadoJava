package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)

        int x = 55;
        int y = 7;
        int max = (x > y) ? x : y;
        System.out.println("max = " + max);
        
        int min = ( x< y) ? x : y;
        System.out.println("min = " + min);

        boolean b =  (x ==y) ? true : false;
        System.out.println("b = " + b);

        String  s = (x == y ) ? "같아요": "달룡";
        System.out.println(s);
    }
}
