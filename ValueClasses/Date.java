package ValueClasses;

import java.io.Serializable;
import java.util.*;

public class Date implements Comparable<Date>, Serializable {

    private int year;
    private int month;
    private int day;
    
    public Date()
	{
		
	}
    
    public Date(int year, int month, int day) {
    	this.year = year;
    	this.month = month;
    	this.day = day;
    }
    
    public int getyear() {
		return year;
	}
    
    public int getmonth() {
		return month;
	}
    public int getday() {
		return day;
	}

    public String toString()
	{
		return "Date [Year: "+getyear()+"Month: "+getmonth()+"Day: "+getday()+"]"; 
	}

   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
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
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public int compareTo(Date o) {
		if (((Date) o).equals(this))
			return 0;
		if (((Date) o).getClass() == this.getClass())
		{
			if (getyear() > ((Date) o).getyear())
				return 1;
			else if (getyear() < ((Date) o).getyear())
				return -1;
			else 
				return -1;
		}		
		return -2; // Classes Didn't match
	}

	}

