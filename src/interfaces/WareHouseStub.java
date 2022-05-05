package interfaces;

public class WareHouseStub implements Warehouse{

  @Override
  public boolean hasInventory(String product, int quantity) {
    return true;
  }

  @Override
  public boolean remove(String product, int quantity) {
    return true;
  }
}
