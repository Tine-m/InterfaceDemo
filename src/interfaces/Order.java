package interfaces;

public class Order {
  private String item;
  private int quantity;

  public Order(String item, int quantity) {
    this.item = item;
    this.quantity = quantity;
  }

  public boolean fill(Warehouse wareHouse) {
    boolean fulfilled = false;
    if (wareHouse.hasInventory(item, quantity)) {
      wareHouse.remove(item, quantity);
      fulfilled = true;
    } else {
      System.out.println("Send email: Not enough in stock");
    }
    return fulfilled;
  }
}
