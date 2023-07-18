
package project.swingcalculator;

public class MNX implements ICurrency {
    public String name = "Pesos Mexicanos - MXN";
    public double usdToMnx = 16.75;

    public MNX() {
    }

    @Override
    public double getCurrencyExchange() {
        return usdToMnx;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
