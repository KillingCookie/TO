import decorator.Car;
import decorator.CarPainterDecorator;
import decorator.Hatchback;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void Decorator() {
        Car hatch = new Hatchback("Ford", "Focus", 200);

        Car blueHatch = new CarPainterDecorator(hatch, "azure blue");

        assertEquals(false, ((CarPainterDecorator) blueHatch).isPainted());
        blueHatch.printCharacteristics();
        assertEquals(true, ((CarPainterDecorator) blueHatch).isPainted());

    }

}
