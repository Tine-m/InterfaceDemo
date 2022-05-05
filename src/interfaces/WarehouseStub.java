package interfaces;

import java.util.ArrayList;

public class WarehouseStub implements Warehouse{

  private ArrayList<Product> inventory;

  public WarehouseStub() {
    this.inventory = new ArrayList<>();
    populateWarehouse();
  }

  private void populateWarehouse() {
    inventory.add(new Product("TALISKER", 50));
    inventory.add(new Product("TALISKER2", 50));
  }

  @Override
  public boolean hasInventory(String itemName, int quantity) {
    Product found = findProduct(itemName);
    if (found != null) {
      if (found.getQuantityAvailable() >= quantity) {
        return true;
      } else return false; // not enough items in stock
    } else return false; // no such product
  }

  @Override
  public void remove(String itemName, int quantity) {
    Product found = findProduct(itemName);
    found.remove(quantity);
  }

  private Product findProduct(String itemName) {
    for (Product product : inventory) {
      if (product.getProductName().equals(itemName)) {
        return product;
      }
    }
    return null;
  }
}
