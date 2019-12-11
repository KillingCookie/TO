package employees.income;

public class DirectorIncome extends Income {

    public DirectorIncome(int monthlySalary) {

        super(monthlySalary, 0);

    }

    @Override
    public void riseMonthlySalary() {

        monthlySalary += 0.1*monthlySalary;

    }

    @Override
    public void loverMonthlySalary() {

        monthlySalary -= 0.1*monthlySalary;

    }

    @Override
    public void giveBonus() {

        bonuses = 20*monthlySalary;

    }

}
