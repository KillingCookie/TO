public class BuyStock implements Transaction {

    private Stock stock;

    public BuyStock(Stock stock){

        this.stock = stock;

    }

    public void execute(int quantity) {

        stock.buy(quantity);

    }

}
