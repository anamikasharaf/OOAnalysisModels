package ValueClasses;

import java.io.Serializable;
import java.util.*;

public class Currency implements Serializable {

    public Currency(String major,String minor,String ISO, int MonetaryUnit) {
    	this.majorCurrency = major;
    	this.minorCurrency = minor;
    	this.ISOCode = ISO;
    	this.fractionalMonetaryUnit = MonetaryUnit;
    }

    private String majorCurrency;
    private String minorCurrency;
    private String ISOCode;
    private int fractionalMonetaryUnit;
    
    public String getISOCode() {
		return ISOCode;
	}

	public String getMajorCurrency() {
		return majorCurrency;
	}

	public String getMinorCurrency() {
		return minorCurrency;
	}

	public int getfractionalMonetaryUnit() {
		return fractionalMonetaryUnit;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISOCode == null) ? 0 : ISOCode.hashCode());
		result = prime * result + fractionalMonetaryUnit;
		result = prime * result
				+ ((majorCurrency == null) ? 0 : majorCurrency.hashCode());
		result = prime * result
				+ ((minorCurrency == null) ? 0 : minorCurrency.hashCode());
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
		Currency other = (Currency) obj;
		if (ISOCode == null) {
			if (other.ISOCode != null)
				return false;
		} else if (!ISOCode.equals(other.ISOCode))
			return false;
		if (fractionalMonetaryUnit != other.fractionalMonetaryUnit)
			return false;
		if (majorCurrency == null) {
			if (other.majorCurrency != null)
				return false;
		} else if (!majorCurrency.equals(other.majorCurrency))
			return false;
		if (minorCurrency == null) {
			if (other.minorCurrency != null)
				return false;
		} else if (!minorCurrency.equals(other.minorCurrency))
			return false;
		return true;
	}

	public String toString(Money m)
	{
		return "Currency [ MajorCurrency: "+ getMajorCurrency() + " MinorCurrency: "+ getMinorCurrency()+" ISOCode: "+getISOCode()+", ConversionFactor:"+ getfractionalMonetaryUnit()+" ]";
	}

    public int minorIntoMajor(Money m) {
       int minorAmount = m.getminoramount();
       int value = minorAmount/fractionalMonetaryUnit;
       return value;
     }


}
