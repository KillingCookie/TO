package factoryMethod;

public abstract class CPU {

    String company;
    long ID;
    private static long nextID = 0;

    CPU(){

        ID = nextID++;
    }

    abstract public void printName();
}
