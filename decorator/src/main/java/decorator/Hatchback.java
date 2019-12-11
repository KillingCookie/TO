package decorator;

public class Hatchback extends Car {

    private String type;

    public Hatchback(String producer, String model, float velocity){

        super(producer, model, velocity);
        this.type = "hatchback";

    }

    @Override
    public void printCharacteristics(){

        System.out.println(producer + " " + model + " " + type + " max speed: " + velocity);

    }

}
