import java.util.ArrayList;

public class VegetarianRestaurant implements Restaurant {

    public Menu getMenu(){

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Veg food");

        return new OnlyVegetarianMenu(menu);

    }

}
