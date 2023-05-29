package chap_10;

public class _02AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momBurger = getMomBurger();
        momBurger.cook();

        System.out.println("--------------");
        HomeMadeBurger broBurger = getBroBurger();
        broBurger.cook();

    }

    private static HomeMadeBurger getBroBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("브로 버거 만들기");
                System.out.println("특제 소스 추가");
            }
        };
    }


    public static HomeMadeBurger getMomBurger(){
        // 익명 클래스에서 마치 익명클래스를 상속받는것 처럼 사용
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마 버거");
                System.out.println("버거재료들~");
            }
        };
    }
}
abstract class HomeMadeBurger{
    public abstract void cook();
}