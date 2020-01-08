public class RealContainer<T> implements Container {

    private int max_size = 10;
    private int size = 0;
    private Object[] container;

    public RealContainer(){

        container = new Object[max_size];

    }

    public void addItem(T t){

        if(size < max_size - 1){

            container[size] = t;
            size++;

        }

    }

    public Iterator createIterator() {

        return new RealIterator(container);

    }

}
