package decorator;

public class CarPainterDecorator extends CarDecorator {

    private String color = "white";
    private boolean painted = false;

    public CarPainterDecorator(Car car, String color) {

        super(car);
        this.color = color;

    }

    @Override
    public void printCharacteristics() {
        car.printCharacteristics();
        setColor(car, color);
    }

    private void setColor(Car car, String color){

        System.out.println("Painted " + color);
        painted = true;

    }

    public boolean isPainted(){

        return painted;

    }

}
