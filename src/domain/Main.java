package domain;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[]args) throws FileNotFoundException {
        Warehouse warehouse = new WarehouseImpl();
        Order order = new Order("TALISKER", 10);
        order.fill(warehouse);
        System.out.println(order.isFilled());
        //end program - save memory objects to persistence storage
       ((WarehouseImpl)warehouse).saveWarehouse();
    }
}
