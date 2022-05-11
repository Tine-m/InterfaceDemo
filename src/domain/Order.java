package domain;

public class Order {
  private String itemName;
  private int quantity;
  private boolean filled;

  public Order(String itemName, int quantity) {
    filled = false;
    this.itemName = itemName;
    this.quantity = quantity;
  }

  public void fill(Warehouse wareHouse) {
    if (wareHouse.hasInventory(itemName, quantity)) {
      wareHouse.remove(itemName, quantity);
      filled = true;
    } else {
      System.out.println("Send email: Not enough in stock");
    }
  }

  public boolean isFilled() {
    return filled;
  }
}
