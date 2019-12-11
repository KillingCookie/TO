package employees.income;

public abstract class Income {

    protected int monthlySalary, bonuses;

    public Income(int monthlySalary, int bonuses){

        this.monthlySalary = monthlySalary;
        this.bonuses = bonuses;

    }

    public int getThisMonthIncome(){

        return monthlySalary + bonuses;

    }

    abstract public void riseMonthlySalary();
    abstract public void loverMonthlySalary();

    public int getMonthlySalary(){

        return monthlySalary;

    }

    abstract public void giveBonus();

    public int getBonuses(){

        return bonuses;

    }

}
