package interfaces;

public class WarehouseStub2 implements Warehouse{
  @Override
  public boolean hasInventory(String product, int quantity) {
    return false;
  }

  @Override
  public void remove(String product, int quantity) {

  }
}
