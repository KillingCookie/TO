public abstract class Employee {

    private String name, position;
    private long id;
    private static long nextId = 0;

    public Employee(String name, String position){

        this.name = name;
        this.position = position;
        id = nextId++;

    }

    public void printData(){

        System.out.println(name + ", " + position + ", id: " + id);

    }

}
