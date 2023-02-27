package chap_09.coffe;

// 제너릭
//  public class Coffee<T>  << 이렇게
//    public  T name << 어떤타입인 ㅣ모름~ 외부에서 주입~
public class Coffee<T> {
    public T name;

    public Coffee(T name) {
        this.name = name;
    }

    public void ready(){
        System.out.println("이름은~~~ " + name);
    }
}
