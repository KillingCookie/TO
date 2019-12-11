package employees;

import employees.income.Income;

public abstract class Employee {

    private String name, position;
    private Income income;
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
