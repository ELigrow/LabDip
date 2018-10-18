package edu.wctc.eligrow.lab2;

public class TipCalculatorService {

    public double getTip(ITipCalculator tc){
        double tip;

        tip = tc.getTip();

        return tip;
    }

    public void setQualityService(ITipCalculator tc, int option){
        switch (option){
            case 1:
                tc.setServiceRating(ITipCalculator.ServiceQuality.GOOD);
                break;
            case 2:
                tc.setServiceRating(ITipCalculator.ServiceQuality.FAIR);
                break;
            case 3:
                tc.setServiceRating(ITipCalculator.ServiceQuality.POOR);
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
