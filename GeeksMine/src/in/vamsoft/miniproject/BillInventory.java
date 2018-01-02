package in.vamsoft.miniproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BillInventory {

  public void customerDetails() {

    System.out.println("Enter CustomerId");
    Scanner s = new Scanner(System.in);
    int cusId = s.nextInt();
    System.out.println("Enter CustomerName");
    Scanner s1 = new Scanner(System.in);
    String cusName = s1.nextLine();
    CustomerInventory c = new CustomerInventory(cusId, cusName);
    System.out.println("Id\t" + cusId + "\n " + "" + "Name\t" + cusName);
  }

  public void productDetails() {

    ProductInventory obj = new ProductInventory();
    obj.setProductId(1);
    obj.setProductName("Mobile");
    obj.setPrice(1000.0);
    obj.setQuantity(10);
    System.out.println(obj);
    ProductInventory obj1 = new ProductInventory();
    obj1.setProductId(2);
    obj1.setProductName("Laptop");
    obj1.setPrice(2000.0);
    obj1.setQuantity(5);
    System.out.println(obj1);
    System.out.println("Enter product you want");
    Scanner s1 = new Scanner(System.in);
    String product = s1.nextLine();
    System.out.println("Enter quantity");
    int quantity = s1.nextInt();

    System.out.println("Selected product is: " + product);
    System.out.println("Total amount is" + (quantity * obj.getPrice()));
  }

  public static void main(String[] args) {

    BillInventory inventory = new BillInventory();
    inventory.customerDetails();
    inventory.productDetails();

  }

}
