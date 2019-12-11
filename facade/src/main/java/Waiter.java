public class Waiter {

    public OnlyVegetarianMenu getOnlyVegetarianMenu() {

        VegetarianRestaurant r = new VegetarianRestaurant();
        OnlyVegetarianMenu vegMenu = (OnlyVegetarianMenu)r.getMenu();
        return vegMenu;

    }

    public VegetarianMenu getVegetarianMenu() {

        OrdinaryRestaurant r = new OrdinaryRestaurant();
        VegetarianMenu vegMenu = (VegetarianMenu)r.getMenu(true);
        return vegMenu;

    }

    public OrdinaryMenu getNormalMenu() {

        OrdinaryRestaurant r = new OrdinaryRestaurant();
        OrdinaryMenu menu = (OrdinaryMenu) r.getMenu();
        return menu;

    }

}
