package decorator;

public class Sedan extends Car {

    private String type;

    public Sedan(String producer, String model, float velocity){

        super(producer, model, velocity);
        this.type = "sedan";

    }

    @Override
    public void printCharacteristics(){

        System.out.println(producer + " " + model + " " + type + " max speed: " + velocity);

    }

}
