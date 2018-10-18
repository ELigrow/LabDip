package edu.wctc.eligrow.lab2;

public interface ITipCalculator {
    public double getTip();
    public enum ServiceQuality{GOOD, FAIR, POOR}
    public void setServiceRating(ServiceQuality sq);
    public ServiceQuality getServiceQuality();
}
