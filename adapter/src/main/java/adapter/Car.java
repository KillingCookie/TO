package adapter;

public class Car implements Moveable {

    private String producer, model;
    private float velocity;

    public Car(String producer, String model, float velocity){

        this.producer = producer;
        this.model = model;
        this.velocity = velocity;

    }

    public float getVelocity() {

        return velocity;

    }

}
