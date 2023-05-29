package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _Quiz_10 {
    private static final int price = 5000;

    public static void main(String[] args) {

        Customer customer1 = new Customer("챈들러", 50);
        Customer customer2 = new Customer("레이첼", 42);
        Customer customer3 = new Customer("모니카", 21);
        Customer customer4 = new Customer("벤자민", 18);
        Customer customer5 = new Customer("제임스", 5);

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

        customerList.stream()
                    .map( x -> {if(x.getAge()>=20){
                            x.setCost("5000원입니다.");
                        }else {
                            x.setCost("무료입니다.");
                        }
                        return x;})
                    .forEach(x -> System.out.println(x.getName() + x.getCost()));

    }
}


class Customer{
    private String name;
    private int age;
    private String cost;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
