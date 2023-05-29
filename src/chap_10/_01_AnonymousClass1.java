package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카논");

        System.out.println("=====");

        Coffee c2 = new Coffee();
        c1.order("라떼");
        System.out.println("=====");

        // 특이 케이스

        Coffee specialCoffee = new Coffee(){
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("추가적인 요청입니다~");
            }


            @Override
            public void returnTray() {
                System.out.println("특이한 요청반납");
            }
        };
        specialCoffee.order("바닐라라떼");
        // 익명클래스 : 일회성 코드 (추가적인 기능을 넣을때)
        specialCoffee.returnTray();
    }
}


class Coffee{
    public void order(String coffee){
        System.out.println( coffee +" 나왓스빈당~");
    }

    public void returnTray(){
        System.out.println("반납 완료");
    }
}