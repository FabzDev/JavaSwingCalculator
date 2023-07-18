
package project.swingcalculator;


public class USD implements ICurrency {
    public String name = "Dolares americános - USD";
    public double usdToUsd = 1;

    public USD() {
    }

    @Override
    public double getCurrencyExchange() {
         return usdToUsd;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
