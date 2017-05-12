package ValueClasses;

import java.io.Serializable;
import java.util.*;


public class Telephone implements Serializable {

    public Telephone(String cityCode, String number, String extension, String countrycode,TelephoneNumberType type) {
    	this.cityCode = cityCode;
    	this.number = number;
    	this.extension = extension;
    	this.countryCode = countrycode;
    	this.type = type;
    }

    private String cityCode;
    private String number;
    private String extension = "";
    public String countryCode = "1";
    private TelephoneNumberType type;

    public String getcityCode() {
		return cityCode;
	}
    
    public String getnumber() {
		return number;
	}
    
    public String getextension() {
		return extension;
	}
    
    public String getcountryCode() {
		return countryCode;
	}
    
    public TelephoneNumberType gettype() {
		return type;
	}
    
    public String toString()
	{
		return "Telephone [ City Code: "+ getcityCode() + " number: "+ getnumber()+" extension: "+getextension()+", Country Code:"+ getcountryCode()+", Telephone Type:"+ gettype()+",]";
	}


}
