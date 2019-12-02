package decorator;

public abstract class Car {

    protected String producer, model;
    protected float velocity;

    public Car(String producer, String model, float velocity){

        this.producer = producer;
        this.model = model;
        this.velocity = velocity;

    }

    public void printCharacteristics(){

        System.out.println(producer + model + "max speed" + velocity);

    }

}
