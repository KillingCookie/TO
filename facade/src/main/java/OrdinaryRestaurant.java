import java.util.ArrayList;

public class OrdinaryRestaurant implements Restaurant {

    public Menu getMenu(boolean isVegetarian){

        if(isVegetarian){

            ArrayList<String> menu = new ArrayList<String>();
            menu.add("Some vegetarian food");

            return new VegetarianMenu(menu);

        }return getMenu();

    }

    public Menu getMenu() {

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Some normal food");

        return new OrdinaryMenu(menu);

    }
}
