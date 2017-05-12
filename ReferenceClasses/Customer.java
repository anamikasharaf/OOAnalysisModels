package ReferenceClasses;

import java.util.*;
import java.io.Serializable;


public class Customer {
	
	    private String id;
	    private Type type;
	    private Person personalInfo;
	    private CreditCard creditCards; 

    public Customer(String id, Type type,Person personalInfo, CreditCard creditCards) {
    	this.id = id;
    	this.type = type;
    	this.personalInfo = personalInfo;
    	this.creditCards = creditCards;
    }
    
    public String getid() {
		return id;
	}
    
    public Type gettype() {
		return type;
	}

    public Person getpersonalInfo() {
		return personalInfo;
	}

    public CreditCard getcreditCards() {
		return creditCards;
	}

    public String toString() {
    	return "Customer [ Customer ID: "+ getid() + " Customer Type: "+ gettype()+" Personal Info: "+getpersonalInfo()+" Credit Card Detail: "+getcreditCards()+",]"; 
    }

}
