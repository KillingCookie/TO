import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StrategyTest {

    @Test
    public void test() {

        ReadFileStrategy txt = new ReadTxt();
        ReadFileStrategy KCtx = new ReadKCtx();

        assertTrue(txt.read("src/main/resources/txt").equals(KCtx.read("src/main/resources/KCtx")));

    }

}
