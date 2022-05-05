package interfaces;

public class Product {
  private String productName;
  private int quantityOnHand;

  public Product(String productName, int quantityOnHand) {
    this.productName = productName;
    this.quantityOnHand = quantityOnHand;
  }

  public String getProductName() {
    return productName;
  }

  public int getQuantityOnHand() {
    return quantityOnHand;
  }

  public void remove(int quantity) {
    quantityOnHand -= quantity;
  }
}
