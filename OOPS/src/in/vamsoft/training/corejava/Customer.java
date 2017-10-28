package in.vamsoft.training.corejava;

import java.util.Comparator;

public class Customer {
	int cusId;
	int mobNo;
	String cusName;
	String address;
	 // Constructor
  public Customer(int cusId,int mobNo, String cusName,
                             String address)
  {
      this.cusId = cusId;
      this.mobNo = mobNo;
      this.cusName = cusName;
      this.address = address;
  }
  public String toString()
  {
      return this.cusId + " " + this.mobNo + " "+this.mobNo +
                         " " + this.address;
  }
	class Sortbyid implements Comparator<Customer>
	{
	    // Used for sorting in ascending order of
	    // roll number
	    public int compare(Customer a, Customer b)
	    {
	        return a.cusId - b.cusId;
	    }
	    class Sortbyname implements Comparator<Customer>
	  	{
	  	    // Used for sorting in ascending order of
	  	    // roll number
	  	 public int compare(Customer a, Customer b)
	  	    {
	  	        return a.cusName.compareTo(b.cusName);
	  	        
	  	    }
	  	}
	}
}
