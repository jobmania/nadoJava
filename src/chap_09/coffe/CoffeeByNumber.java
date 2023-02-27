package chap_09.coffe;

public class CoffeeByNumber {
    public int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready(){
        System.out.println("커피 완료" + waitingNumber);
    }


}
