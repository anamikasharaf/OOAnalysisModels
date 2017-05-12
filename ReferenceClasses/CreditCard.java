package ReferenceClasses;

import java.util.*;
import java.io.Serializable;
import ValueClasses.Time;


public class CreditCard {

    public CreditCard(int creditCardNumber,int securityCode, Person billingInfo, Time expiryDate)
    {
    	this.creditCardNumber = creditCardNumber;
    	this.securityCode = securityCode;
    	this.billingInfo = billingInfo;
    	this.expiryDate = expiryDate;
    }
    

    private int creditCardNumber;
    private int securityCode;
    private Person billingInfo;
    private Time expiryDate;


    public int getcreditCardNumber() {
		return creditCardNumber;
	}
    
    public int getsecurityCode() {
		return securityCode;
	}
    
    public Person getbillingInfo() {
		return billingInfo;
	}
    
    public Time getexpiryDate() {
		return expiryDate;
	}
    
    public String toString() {
    	return "Creadit Card [ CreditCard Number: "+ getcreditCardNumber() + " Security Code: "+ getsecurityCode()+" Billing Info: "+getbillingInfo()+" Expiry date: "+getexpiryDate()+",]"; 
    }

}
