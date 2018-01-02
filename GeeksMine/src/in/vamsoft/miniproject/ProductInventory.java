package in.vamsoft.miniproject;

public class ProductInventory {
  
  int productId;
  String productName;
  double price;
  int quantity;

  public ProductInventory(int productId, String productName, double price, int quantity) {
    super();
    this.productId = productId;
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
  }
  public ProductInventory() {
    // TODO Auto-generated constructor stub
  }
  public int getProductId() {
    return productId;
  }
  public String getProductName() {
    return productName;
  }
  public double getPrice() {
    return price;
  }
  public int getQuantity() {
    return quantity;
  }
  public void setProductId(int productId) {
    this.productId = productId;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  @Override
  public String toString() {
    return "ProductInventory [productId=" + productId + ", productName=" + productName + ", price=" + price
        + ", quantity=" + quantity + "]";
  }
  
}
