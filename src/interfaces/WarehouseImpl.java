package interfaces;

import java.util.ArrayList;

public class WarehouseImpl implements Warehouse {

  private ArrayList<Product> inventory;

  public WarehouseImpl() {
    this.inventory = new ArrayList<>();
  }

  public void populateWarehouse() {
    inventory.add(new Product("TALISKER", 50));
  }

  @Override
  public boolean hasInventory(String productName, int quantity) {
    for (Product p : inventory
    ) {
      if (p.getProductName().equals(productName)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean remove(String productName, int quantity) {
    Product tmp = new Product(productName, quantity);
    for (Product product : inventory
    ) {
      if (product.getProductName().equals(productName)) {
        product.remove(quantity);
      return true;
      }
    }
    return false;
  }
}
