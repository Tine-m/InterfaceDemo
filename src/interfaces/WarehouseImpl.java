package interfaces;

import java.util.ArrayList;

public class WarehouseImpl implements Warehouse {

  private ArrayList<Product> inventory;

  public WarehouseImpl() {
    this.inventory = new ArrayList<>();
    populateWarehouse();
  }

  private void populateWarehouse() {
    inventory.add(new Product("TALISKER", 50));
  }

  @Override
  public boolean hasInventory(String productName, int quantity) {
    Product tmp = findProduct(productName);
    if (tmp != null) {
      if (tmp.getQuantityOnHand() >= quantity) {
        return true;
      } else return false; // not enough items in stock
    } else return false; // no such product
  }

  @Override
  public boolean remove(String productName, int quantity) {
    for (Product product : inventory) {
      if (product.getProductName().equals(productName)) {
        product.remove(quantity);
        return true;
      }
    }
    return false;
  }

  private Product findProduct(String productName) {
    for (Product product : inventory) {
      if (product.getProductName().equals(productName)) {
        return product;
      }
    }
    return null;
  }
}
