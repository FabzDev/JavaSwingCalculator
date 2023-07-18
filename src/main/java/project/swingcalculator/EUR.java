
package project.swingcalculator;

public class EUR implements ICurrency {
    public String name = "Euros - EUR";
    public double usdToEur = 16.75;

    public EUR() {
    }

    @Override
    public double getCurrencyExchange() {
        return usdToEur;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
