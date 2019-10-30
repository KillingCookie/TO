import factoryMethod.AMD;
import factoryMethod.CPUFactory;
import factoryMethod.Intel;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;

public class testFactoryMethod {

    @Test
    public void FactoryMethod() {
        CPUFactory f = new CPUFactory();

        assertTrue(f.getCPU("intel") instanceof Intel);
        assertTrue(f.getCPU("amd") instanceof AMD);
    }
}
