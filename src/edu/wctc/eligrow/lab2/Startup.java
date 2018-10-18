package edu.wctc.eligrow.lab2;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {

    public static void main(String[] args) {

        TipCalculatorService tip = new TipCalculatorService();

        ITipCalculator steve = new BaggageServiceTipCalculator(ITipCalculator.ServiceQuality.FAIR, 2);
        ITipCalculator alex = new FoodServiceTipCalculator(ITipCalculator.ServiceQuality.GOOD, 12.25);

        ITipCalculator[] tips = {steve, alex};

        for(int i = 0; i < tips.length; i++){
            System.out.println("The tip you should give is $" + tips[i].getTip());
        }

        System.out.println("You have decided Steve was GOOD rather than FAIR.");
        System.out.println("You have decided Alex was FAIR rather than GOOD.");

        tip.setQualityService(tips[0], 1);
        tip.setQualityService(tips[1], 2);

        for(int i = 0; i < tips.length; i++){
            System.out.println("The recalculated tip you should give is $" + tips[i].getTip());
        }
    }

}
