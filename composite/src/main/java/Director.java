import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {

    private List<Employee> employees;

    public Director(String name) {

        super(name, "Director");
        employees = new ArrayList<Employee>();

    }

    public void hireEmployee(Employee e){

        employees.add(e);

    }

    public void fireEmployee(Employee e){

        employees.remove(e);

    }

    @Override
    public void printData(){

        super.printData();
        for(Employee e : employees)
            e.printData();

    }

}