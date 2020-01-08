import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandTest {

    @Test
    public void test() {

        Stock aplStock = new Stock("AAPL");

        BuyStock buyStockOrder = new BuyStock(aplStock);
        SellStock sellStockOrder = new SellStock(aplStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder, 10);
        broker.takeOrder(sellStockOrder, 5);

        assertEquals(0, aplStock.getQuantity());

        broker.placeOrders();

        assertEquals(5, aplStock.getQuantity());

    }

}
