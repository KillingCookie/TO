package decorator;

public abstract class CarDecorator extends Car {
    protected Car car;

    public CarDecorator(Car car){

        super(car.producer, car.model, car.velocity);
        this.car = car;

    }

    @Override
    public void printCharacteristics(){

        car.printCharacteristics();

    }

}
