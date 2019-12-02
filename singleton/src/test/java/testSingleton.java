import org.junit.jupiter.api.Test;
import singleton.Singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSingleton {

    @Test
    public void SingletonTest() {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertEquals(singleton2, singleton1);

    }

}
