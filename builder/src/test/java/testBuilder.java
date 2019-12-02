import builder.GPU;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBuilder {

    @Test
    public void Builder() {
        GPU gpu = new GPU.Builder("GIGABYTE").graphicProcessor("NVIDIA GeForce RTX 2070").VRAMType("GDDR6").memoryClockSpeed(14000).VRAM(8).busWidth(256).build();

        assertEquals("GIGABYTE", gpu.getBrand());
        assertEquals("NVIDIA GeForce RTX 2070", gpu.getGraphicProcessor());
        assertEquals("GDDR6", gpu.getVRAMType());
        assertEquals(14000, gpu.getMemoryClockSpeed());
        assertEquals(8, gpu.getVRAM());
        assertEquals(256, gpu.getBusWidth());

    }

}
