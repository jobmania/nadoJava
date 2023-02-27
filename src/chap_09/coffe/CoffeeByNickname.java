package chap_09.coffe;

public class CoffeeByNickname {
    public String nickname;

    public CoffeeByNickname(String nickname) {
        this.nickname = nickname;
    }

    public void ready(){
        System.out.println("준비 " + nickname );
    }
}
