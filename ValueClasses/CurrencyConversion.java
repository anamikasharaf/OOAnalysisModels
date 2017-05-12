package ValueClasses;

import java.util.*;
import java.math.*;

public class CurrencyConversion implements ExchangeRate{
	
	private ExchangeRate exchangerate;
	
	public CurrencyConversion(ExchangeRate exchangerate) {
    	this.exchangerate = exchangerate;
    }

	public ExchangeRate getexchangerate() {
		return exchangerate;
	}
	
	public Money convertUSDToRupee(Money m) {
    	double exchange = 67.0;
        double major = m.getmajoramount() * exchange;
        double temp = major % m.getcurrencytype().getfractionalMonetaryUnit();
        double minor = temp + m.getminoramount() * exchange;
        major = major + minor % m.getcurrencytype().getfractionalMonetaryUnit();
        minor = minor * m.getcurrencytype().getfractionalMonetaryUnit();
        
        return new Money(m.getcurrencytype(), (int)major, (int)minor);
    }
    
    public Money convertRupeeToUSD(Money m) {
    	double exchange = 1 / 67.0;
        double major = m.getmajoramount() * exchange;
        double temp = major % m.getcurrencytype().getfractionalMonetaryUnit();
        double minor = temp + m.getminoramount() * exchange;
        major = major + minor % m.getcurrencytype().getfractionalMonetaryUnit();
        minor = minor * m.getcurrencytype().getfractionalMonetaryUnit();
        
        return new Money(m.getcurrencytype(), (int)major, (int)minor);
    }
    
    public Money convertUSDToPound(Money m) {
    	double exchange = 0.81;
        double major = m.getmajoramount() * exchange;
        double temp = major % m.getcurrencytype().getfractionalMonetaryUnit();
        double minor = temp + m.getminoramount() * exchange;
        major = major + minor % m.getcurrencytype().getfractionalMonetaryUnit();
        minor = minor * m.getcurrencytype().getfractionalMonetaryUnit();
        
        return new Money(m.getcurrencytype(), (int)major, (int)minor);
    }
    
    public Money convertPoundToUSD(Money m) {
    	double exchange = 1 / 0.81;
        double major = m.getmajoramount() * exchange;
        double temp = major % m.getcurrencytype().getfractionalMonetaryUnit();
        double minor = temp + m.getminoramount() * exchange;
        major = major + minor % m.getcurrencytype().getfractionalMonetaryUnit();
        minor = minor * m.getcurrencytype().getfractionalMonetaryUnit();
        
        return new Money(m.getcurrencytype(), (int)major, (int)minor);
    }

}
