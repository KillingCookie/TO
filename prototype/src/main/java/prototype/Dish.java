package prototype;

public abstract class Dish implements Cloneable{ //MODULES


    private long id;
    private static long nextID = 0;
    protected String type;

    public Dish(){

        id = nextID++;

    }

    abstract public void printName();

    public String getType(){

        return type;

    }

    public long getId() {

        return id;

    }

    @Override
    public Object clone() {
        Object clone = null;

        try {

            clone = super.clone();

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();

        }return clone;

    }

}
