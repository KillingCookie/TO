package employees.income;

public class SimpleEmployeeIncome extends Income{

    public SimpleEmployeeIncome(int monthlySalary) {

        super(monthlySalary, 0);

    }

    @Override
    public void riseMonthlySalary() {

        monthlySalary += 0.05*monthlySalary;

    }

    @Override
    public void loverMonthlySalary() {

        monthlySalary -= 0.05*monthlySalary;

    }

    @Override
    public void giveBonus() {

        bonuses = 10*monthlySalary;

    }

}
