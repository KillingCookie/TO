import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlyweightTest {

    @Test
    public void test() {

        ShapeFactory sf = new ShapeFactory();

        sf.createShape(50,20,40, Color.RED, "circle");
        assertEquals(1, sf.getShapes().size());
        sf.createShape(50,20,40, Color.RED, "circle");
        assertEquals(1, sf.getShapes().size());

    }

}
