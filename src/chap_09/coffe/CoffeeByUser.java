package chap_09.coffe;

import chap_09.user.User;

//<T extends User> 형 제한 시기킥
public class CoffeeByUser<T extends User> { /// 정해진 클래스만 받고 이외의 클래스는 제한!
    // 유저클래스또는 유저를 상속한 클래스만 들어올수 있따!!!

    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }


    public void ready(){
        System.out.println("user.name = " + user.name);
        user.addPoint();
    }
}
