import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape createShape(int size, int x, int y, Color color, String name){

        String data = Integer.toString(size) + Integer.toString(x) + Integer.toString(y) + "." + color.toString() + name;
        Shape shape = shapes.get(data);
        if(shape == null){

            if(name == "square") {

                shape = new Square(size, x, y, color);
                shapes.put(data, shape);

            }else if(name == "circle"){

                shape = new Circle(size, x, y, color);
                shapes.put(data, shape);

            }

        }return shape;

    }

    public static Map<String, Shape> getShapes() {
        return shapes;
    }

}
