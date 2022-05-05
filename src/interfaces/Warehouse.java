package interfaces;

public interface Warehouse {

  public boolean hasInventory(String product, int quantity);
  public boolean remove(String product, int quantity);

}
