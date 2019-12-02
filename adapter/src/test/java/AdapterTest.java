import adapter.Car;
import adapter.Moveable;
import adapter.MoveableUSImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterTest {

    @Test
    public void Adapter() {
        Moveable car = new Car("Ford", "Focus", 100);
        MoveableUSImpl uscar = new MoveableUSImpl(car);

        assertEquals(car.getVelocity()*0.6213712f, uscar.getVelocity());

    }

}
