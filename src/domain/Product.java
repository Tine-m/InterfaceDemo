package domain;

public class Product {
  private String productName;
  private int quantityAvailable;

  public Product(String productName, int quantityAvailable) {
    this.productName = productName;
    this.quantityAvailable = quantityAvailable;
  }

  public String getProductName() {
    return productName;
  }

  public int getQuantityAvailable() {
    return quantityAvailable;
  }

  public void remove(int quantity) {
    quantityAvailable -= quantity;
  }
}
