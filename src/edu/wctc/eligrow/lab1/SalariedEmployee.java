package edu.wctc.eligrow.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements IEmployee {

    /** default constructor. Is this the best way to go? */
    public SalariedEmployee() {}

    private double annualSalary;
    private double annualBonus;
    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    private void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }


    @Override
    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    private void setAnnualBonus(double annualBonus){
        this.annualBonus = annualBonus;
    }
}
