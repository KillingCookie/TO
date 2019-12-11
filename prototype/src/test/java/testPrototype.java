import org.junit.jupiter.api.Test;
import prototype.Barszcz;
import prototype.Pierogi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testPrototype {

    @Test
    public void PrototypeTest() {

        Barszcz b1 = new Barszcz();
        Barszcz b2 = (Barszcz) b1.clone();
        Pierogi p1 = new Pierogi();
        Pierogi p2 = (Pierogi) p1.clone();

        assertNotEquals(b2, b1);
        assertNotEquals(p2, p1);

    }

}
