import java.util.*;

class Customer {
  int id;
  String name;
  double amount;

  public Customer(int id, String name, double amount) {
    this.id = id;
    this.name = name;
    this.amount = amount;

  }
}

public class HashMapExample {
  public static void main(String[] args) {
    Map<Integer, Customer> map = new Hashtable<Integer, Customer>();
    Customer c1 = new Customer(101, "Raji", 10000);
    Customer c2 = new Customer(102, "Suba", 65543);
    Customer c3 = new Customer(103, "Ranjini", 8766);
    map.put(1, c1);
    map.put(2, c2);
    map.put(3, c3);
    for (Map.Entry<Integer, Customer> entry : map.entrySet()) {
      int key = entry.getKey();
      Customer b = entry.getValue();
      System.out.println(key + " Details:");
      System.out.println(b.id + " " + b.name + " " + b.amount);
    }
  }
}