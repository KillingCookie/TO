import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorTest {

    @Test
    public void test() {

        RealContainer<String> realOne = new RealContainer<String>();
        realOne.addItem("one");
        realOne.addItem("two");
        realOne.addItem("three");

        Iterator realItr = realOne.createIterator();

        assertEquals("one", realItr.next().toString());
        assertTrue(realItr.hasNext());
        assertEquals("two", realItr.next().toString());
        assertTrue(realItr.hasNext());
        assertEquals("three", realItr.next().toString());
        assertFalse(realItr.hasNext());

    }

}
