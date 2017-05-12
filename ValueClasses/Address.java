package ValueClasses;

import java.io.Serializable;
import java.util.*;

public class Address implements Serializable {

    public Address(String addessLine1,String addressLine2, String city, String Province, int postalCode, String country) {
    this.addessLine1 = addessLine1;
    this.addressLine2 = addressLine2;
    this.city = city;
    this.Province = Province;
    this.postalCode = postalCode;
    this.country = country;
    }

    private String addessLine1;
    private String addressLine2;
    private String city;
    private String Province;
    private int postalCode;
    private String country;

    public String getaddessLine1() {
		return addessLine1;
	}
    
    public String getaddressLine2() {
		return addressLine2;
	}
    
    public String getcity() {
		return city;
	}
    
    public String getProvince() {
		return Province;
	}
    
    public int getpostalCode() {
		return postalCode;
	}
    
    public String getcountry() {
		return country;
	}
    
    public String toString()
	{
		return "Address [ AddessLine1: "+ getaddessLine1() + " AddressLine2: "+ getaddressLine2()+" City: "+getcity()+", Province:"+ getProvince()+", Postal Code:"+ getpostalCode()+", Country:"+ getcountry()+",]";
	}
  
}
