import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestProxy {

    @Test
    public void proxyTest() {

        Render r = new Render("TO lab", 800, 600);
        ImageProxy proxyImg = new ImageProxy("to.png");

        assertEquals(null, proxyImg.getRealImage());
        r.render(proxyImg);
        r.render(proxyImg);
        assertTrue(proxyImg.getRealImage() instanceof RealImage);

    }

}
