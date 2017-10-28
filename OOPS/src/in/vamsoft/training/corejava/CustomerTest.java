package in.vamsoft.training.corejava;

import java.util.*;
import java.util.Collections;



public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> ar = new ArrayList<Customer>();
    ar.add(new Customer(111, 65,"bbbb", "london"));
    ar.add(new Customer(131,98, "aaaa", "nyc"));
    ar.add(new Customer(121,876, "cccc", "jaipur"));

    System.out.println("Unsorted");
    for (int i=0; i<ar.size(); i++)
        System.out.println(ar.get(i));

    Collections.sort(ar, new Sortbyid());

    System.out.println("\nSorted by Id");
    for (int i=0; i<ar.size(); i++)
        System.out.println(ar.get(i));

    Collections.sort(ar, new Sortbyname());

    System.out.println("\nSorted by name");
    for (int i=0; i<ar.size(); i++)
        System.out.println(ar.get(i));
}
}
