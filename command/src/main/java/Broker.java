import java.util.HashMap;
import java.util.Map;

public class Broker {

    private Map<Transaction, Integer> orderList = new HashMap<Transaction, Integer>();

    public void takeOrder(Transaction transaction, int quantity){

        orderList.put(transaction, quantity);

    }

    public void placeOrders(){

        for (Map.Entry<Transaction, Integer> order : orderList.entrySet()) {
            order.getKey().execute(order.getValue());
        }
        orderList.clear();
    }

}