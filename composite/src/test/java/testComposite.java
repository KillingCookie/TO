import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testComposite {

    @Test
    public void Builder() {

        Director d = new Director("Carl Zimmer");
        Manager m = new Manager("John Williams");
        Constructor c = new Constructor("Michael Brown");

        d.hireEmployee(m);
        d.hireEmployee(c);
        d.printData();

        assertTrue(d instanceof Employee);
        assertTrue(m instanceof Employee);
        assertTrue(c instanceof Employee);

    }

}
