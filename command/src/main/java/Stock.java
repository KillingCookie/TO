public class Stock {

    private String companyName;
    private int quantity = 0;

    public Stock(String companyName){

        this.companyName = companyName;

    }

    public void buy(int quantity){

        this.quantity += quantity;

    }

    public void sell(int quantity){

        this.quantity -=quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public String getCompanyName() {
        return companyName;
    }

}
