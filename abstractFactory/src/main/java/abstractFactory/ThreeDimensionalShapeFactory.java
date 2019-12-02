package abstractFactory;

public class ThreeDimensionalShapeFactory extends AbstractFactory {

    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("cube")){

            return new Cube();
        }else if(shapeType.equalsIgnoreCase("sphere")) {

            return new Sphere();
        }return null;
    }
}