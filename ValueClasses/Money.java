package ValueClasses;

import java.io.Serializable;
import java.util.*;


public class Money implements Comparable<Money>, Serializable, ExchangeRate {

    public Money(Currency currencytype, int major, int minor) {
    	this.majoramount = major;
    	this.minoramount = minor;
    	this.currencytype = currencytype;
    }
    int minoramount;
    private int majoramount;
    private Currency currencytype;

    public Money roundOff(Money amount) {
       if(amount.minoramount < 5){
    	   amount.minoramount = 0;}
       else{
    	   amount.majoramount = amount.majoramount + 1;
       	   amount.minoramount = 0;}
       return amount;
    }

    public Money add(Money amt1, Money amt2) throws Exception {
    	if(amt1.currencytype != amt2.currencytype) throw new Exception("incompatable Currency");
    	amt1.minoramount+= amt2.minoramount;
    	amt1.majoramount+= amt2.majoramount;
        return amt1;
    }

    public Money subtract(Money amt1, Money amt2) throws Exception {
    	if(amt1.currencytype != amt2.currencytype) throw new Exception("incompatable Currency");
    	amt1.minoramount-= amt2.minoramount;
    	amt1.majoramount-= amt2.majoramount;
        return amt1;
    }

    public Money multiply(int value) {
    	return new Money(this.currencytype,this.majoramount*value,this.minoramount*value);
    }

    public Money divide(int value) {
    	return new Money(this.currencytype,this.majoramount/value,this.minoramount/value);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((currencytype == null) ? 0 : currencytype.hashCode());
		result = prime * result + majoramount;
		result = prime * result + minoramount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (currencytype == null) {
			if (other.currencytype != null)
				return false;
		} else if (!currencytype.equals(other.currencytype))
			return false;
		if (majoramount != other.majoramount)
			return false;
		if (minoramount != other.minoramount)
			return false;
		return true;
	}
	
	 
    public int getmajoramount() {
		return majoramount;
	}

	public int getminoramount() {
		return minoramount;
	}
	
	public Currency getcurrencytype() {
		return currencytype;
	}
	
	public String toString()
	{
		return "Money [Currency: "+getcurrencytype()+"MajorCurrency: "+getmajoramount()+"MinorCurrency: "+getminoramount()+"]"; 
	}
  
	@Override
	public int compareTo(Money o) {
		if (((Money) o).equals(this))
			return 0;
		if (((Money) o).getClass() == this.getClass() && getcurrencytype() == ((Money) o).getcurrencytype())
		{
			if (getmajoramount() > ((Money) o).getmajoramount())
				return 1;
			else if (getmajoramount() < ((Money) o).getmajoramount())
				return -1;
			else if (getminoramount() > ((Money) o).getminoramount())
				return 1;
			else 
				return -1;
		}		
		return -2; // Classes Didn't match
	}

}
