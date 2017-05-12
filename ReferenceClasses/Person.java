package ReferenceClasses;

import java.util.*;
import java.io.Serializable;

import ValueClasses.Address;
import ValueClasses.Email;
import ValueClasses.Gender;
import ValueClasses.Telephone;
import ValueClasses.Title;

public class Person {

	public Person(String firstName, String lastName, String nationality,Telephone telephonenumbers,Address addresses, Email emailAddresses, Gender gender, Date dateofbirth,Title title) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nationality = nationality;
    this.telephonenumbers = telephonenumbers;
    this.addresses = addresses;
    this.emailAddresses = emailAddresses;
    this.gender = gender;
    this.dateofbirth = dateofbirth;
    this.title = title;
    }

    private String firstName;
    private String lastName;
    private String nationality;
    private Telephone telephonenumbers;
    private Address addresses;
    private Email emailAddresses;
    private Gender gender;
    private Date dateofbirth;
    private Title title;

    public String getfirstName() {
		return firstName;
	}

    public String getlastName() {
		return lastName;
	}

    public String getnationality() {
		return nationality;
	}

    public Telephone gettelephonenumbers() {
		return telephonenumbers;
	}

    public Address getaddresses() {
		return addresses;
	}

    public Email getemailAddresses() {
		return emailAddresses;
	}

    public Gender getgender() {
		return gender;
	}

    public Date getdateofbirth() {
		return dateofbirth;
	}

    public Title gettitle() {
		return title;
	}

    public String toString() {
    	return "Person [ FirstName: "+ getfirstName() + " LastName: "+ getlastName()+", Nationality:"+ getnationality()+", TelePhone:"+ gettelephonenumbers()+", Address:"+ getaddresses()+",  Email:"+ getemailAddresses()+",  Gender:"+ getgender()+",  Birthday:"+ getdateofbirth()+",  Title:"+ gettitle()+",]";
    }


}
