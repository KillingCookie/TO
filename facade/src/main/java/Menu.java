import java.util.ArrayList;
import java.util.Iterator;

public abstract class Menu {

    private ArrayList<String> menu;

    public Menu(ArrayList<String> list) {

        menu = list;

    }

    public void printMenu(){

        for(String s : menu)
            System.out.println(s);

    }

    public ArrayList<String> getMenu(){

        return menu;

    }

}
