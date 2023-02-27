package chap_09;

import chap_09.coffe.*;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass {
    //제네릭ㄱ클래스~
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("엄준식");
        c2.ready();

        System.out.println("---------------------------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("김찬호");
        c4.ready();

        System.out.println("----------------------");
        
        int c3Name = (int)c3.name;// 형변환 필요
        System.out.println("c3Name = " + c3Name);
        
        
        String c4Name = (String) c4.name;
        System.out.println("c4Name = " + c4Name);

        // 정수는 문자열로 형변환 x 형변환 오류 발생함..
//        c4Name = (String) c3.name; //Integer cannot be cast to java.lang.String
// 정수를 문자열로 형변환 x , 컴파일 시점 오류 x

        System.out.println("----------------------");

        Coffee<Integer> c5 = new Coffee<>(65);
        c5.ready();


        Coffee<String> c6 = new Coffee<>("문재인");
        c6.ready();

        System.out.println("----------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("도파고"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("미야고"));
        c8.ready();

//        CoffeeByUser<User> c9 = new CoffeeByUser<>(new Ammu("미야고"));
        // 원하는 객체왜 다른객체면 짜름~

        orderCoffee("쿠쿨자");
        orderCoffee(968);
        orderCoffee("바리안","카푸치노");
        orderCoffee("랄로",2400);
    }


     public static <T> void orderCoffee(T name){
         System.out.println("name = " + name);
     }
    public static <T,V> void orderCoffee(T name,V coffee)    {  //2개 넣을때~
        System.out.println(coffee + " 준비완료 " + name );
    }





}

class Ammu{

}