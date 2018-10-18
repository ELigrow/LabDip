package edu.wctc.eligrow.lab1;

import javax.swing.JOptionPane;

/**
 * Delegates duties of HRService
 * @author Elijah Ligrow
 */
public class HRService {
    private static final String ERROR_MSG =
            "Cannot get annual wages because no valid employee type provided";
    private static final String ERROR_TITLE = "Employee Type Unknown";

    /**
     * Returns annual compensation for employee
     * @param e IEmployee: Employee
     * @return Double: Annual compensation for supported employee types
     */
    public double getAnnualCompensationForEmployee(IEmployee e)
    {
        double annualCompensation = 0;

        annualCompensation = e.getAnnualWages();

        return annualCompensation;
    }
}
