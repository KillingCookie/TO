import abstractFactory.*;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class testAbstractFactory {

    @Test
    public void abstractFactory() {
        TwoDimensionalShapeFactory d2 = new TwoDimensionalShapeFactory();
        ThreeDimensionalShapeFactory d3 = new ThreeDimensionalShapeFactory();

        assertTrue(d2.getShape("CiRcLe") instanceof Circle);
        assertTrue(d3.getShape("SPheRe") instanceof Sphere);

    }
}
