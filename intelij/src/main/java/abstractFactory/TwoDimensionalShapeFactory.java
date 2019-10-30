package abstractFactory;

public class TwoDimensionalShapeFactory extends AbstractFactory {

    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("square")){

            return new Square();
        }else if(shapeType.equalsIgnoreCase("circle")) {

            return new Circle();
        }return null;
    }
}
