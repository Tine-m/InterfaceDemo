package interfaces;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new WarehouseImpl();
        Order order = new Order("TALISKER", 51);
        boolean result = order.fill(new WarehouseImpl());
        System.out.println(result);
    }
}
