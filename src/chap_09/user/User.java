package chap_09.user;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void addPoint(){
        System.out.println(" 적립포인트~ " + name);
    }
}
