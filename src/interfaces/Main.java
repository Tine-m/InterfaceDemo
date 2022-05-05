package interfaces;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Warehouse warehouse = new WarehouseImpl();
        Order order = new Order("TALISKER", 50);
        order.fill(warehouse);
        System.out.println(order.isFilled());
        //end program - save memory objects to persistence storage
        ((WarehouseImpl)warehouse).saveWarehouse();
    }
}
