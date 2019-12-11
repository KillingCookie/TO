import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadeTest {

    @Test
    public void Facade() {

        Waiter w = new Waiter();
        OrdinaryRestaurant or = new OrdinaryRestaurant();
        VegetarianRestaurant vr = new VegetarianRestaurant();

        assertEquals(w.getNormalMenu().getMenu().get(0), or.getMenu().getMenu().get(0));
        assertEquals(w.getVegetarianMenu().getMenu().get(0), or.getMenu(true).getMenu().get(0));
        assertEquals(w.getOnlyVegetarianMenu().getMenu().get(0), vr.getMenu().getMenu().get(0));

    }

}
