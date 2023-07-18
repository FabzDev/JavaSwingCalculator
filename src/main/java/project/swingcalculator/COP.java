
package project.swingcalculator;

public class COP implements ICurrency{
    public String name = "Pesos Colombianos - COP";
    public double usdToCop = 4087.83;

    public COP() {
    }
    
    @Override
    public double getCurrencyExchange() {
        return usdToCop;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
