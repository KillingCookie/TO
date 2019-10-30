package factoryMethod;

public class Intel extends CPU{

    Intel() {

        super();
        company = "Intel";
    }

    public void printName() {

        System.out.println(company);
    }
}
