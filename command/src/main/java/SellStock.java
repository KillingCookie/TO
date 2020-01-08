public class SellStock implements Transaction {

    private Stock stock;

    public SellStock(Stock stock){

        this.stock = stock;

    }

    public void execute(int quantity) {

        stock.sell(quantity);

    }

}
