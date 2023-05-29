package chap_10;

import java.util.ArrayList;

public class _Answer_10 {
    public static void main(String[] args) {

        ArrayList<Customer2> list = new ArrayList<>();
        list.add(new Customer2("엄준식", 50));
        list.add(new Customer2("갈", 10));
        list.add(new Customer2("무자", 30));
        list.add(new Customer2("벤기", 15));
        list.add(new Customer2("푸지", 99));
        // 1. 가공되는 데이터가 있을 경우, 그 데이터가 출력된다.
        list.stream().map( x -> x.getAge() >= 20 ? x.name + "5000원" : x.name + "무료입니다!" ).forEach(System.out::println);
        list.stream().map( x -> x.getAge() >= 20 ? x.name + "5000원" : x.age + "무료입니다!" ).forEach(System.out::println);
        list.stream().map( x -> x.getAge() >= 20 ? x.toString() : x ).forEach(System.out::println);

        list.stream()  // Stream<Customer>
                .map(x -> x.name + " 무료") // Stream<String>
                .map(x -> x + " 입장")
                .forEach(System.out::println);




    }
}

class Customer2{
     String name;
     int age;

    public Customer2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
