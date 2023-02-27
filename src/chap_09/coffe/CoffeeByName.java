package chap_09.coffe;

public class CoffeeByName {
    public Object name;  // Integer, Double , String 다가 능~~~~

    public CoffeeByName(Object name) {
        this.name = name;
    }
    
    public void ready(){
        System.out.println(" 준비완료~ " + name);
    }
}
