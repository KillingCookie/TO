package factoryMethod;

public class AMD extends CPU{

    AMD() {

        super();
        company = "AMD";
    }

    public void printName() {

        System.out.println(company);
    }
}
