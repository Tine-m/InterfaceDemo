package interfaces;

public class WarehouseStub2 implements Warehouse {

  @Override
  public boolean hasInventory(String product, int quantity) {
    if (quantity <= 50)
      return true;
    else return false;
  }

  @Override
  public void remove(String product, int quantity) {

  }
}
