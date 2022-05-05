package interfaces;

public interface Warehouse {

  public boolean hasInventory(String product, int quantity);
  public void remove(String product, int quantity);

}
