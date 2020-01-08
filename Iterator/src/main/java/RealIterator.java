public class RealIterator implements Iterator {

    Object[] container;

    int pos = 0;

    public RealIterator(Object[] container) {

        this.container = container;

    }

    public Object next() {

        Object obj =  container[pos];
        pos += 1;
        return obj;

    }

    public boolean hasNext() {

        if (pos >= container.length || container[pos] == null)
            return false;
        else
            return true;

    }

}
