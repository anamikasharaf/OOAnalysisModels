package ValueClasses;

import java.io.Serializable;
import java.util.*;

public class Email {

    public Email(String userName, String host, String domain) {
    	this.userName = userName;
    	this.host = host;
    	this.domain = domain;
    }

    private String userName;
    private String host;
    private String domain;
    
    public String getuserName() {
		return userName;
	}
    
    public String gethost() {
		return host;
	}
    
    public String getdomain() {
		return domain;
	}

    public String toString() {
    	return "Email [ User Name: "+ getuserName() + " Host: "+ gethost()+" Domain: "+getdomain()+",]"; 
    }


}
