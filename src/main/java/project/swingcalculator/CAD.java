
package project.swingcalculator;

public class CAD implements ICurrency {
    public String name = "Canadian Dolar - CAD";
    public double usdToCad = 1.32;

    public CAD() {
    }
    
    @Override
    public double getCurrencyExchange() {
         return usdToCad;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
