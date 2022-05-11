package domain;

import persistence.FileHandler;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class WarehouseImpl implements Warehouse {

  private ArrayList<Product> inventory;
  private FileHandler fileHandler;

  public WarehouseImpl() throws FileNotFoundException {
    fileHandler = new FileHandler();
    inventory = new ArrayList<>();
    populateWarehouse();
  }

  public void populateWarehouse() throws FileNotFoundException {
    inventory = fileHandler.loadProducts();
  }

  public void saveWarehouse() throws FileNotFoundException {
    fileHandler.saveProducts(inventory);
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
