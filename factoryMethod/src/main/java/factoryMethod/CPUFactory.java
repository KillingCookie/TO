package factoryMethod;

public class CPUFactory {

    public CPU getCPU(String shapeType) {
        if (shapeType.equalsIgnoreCase("intel")) {
            return new Intel();

        } else if (shapeType.equalsIgnoreCase("amd")) {
            return new AMD();

        } else {
            return null;
        }
    }
}
