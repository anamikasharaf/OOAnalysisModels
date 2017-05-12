package ValueClasses;

import java.util.*;

public class Time extends Date{

	private int hour;
    private int min;
    private int utcOffset;
    private TimeType type;
    
    public Time() {
    	this.hour = 12;
    	this.min = 0;
    	this.utcOffset = -8;
    }
    
    public int getHour() {
    	return this.hour;
    }
    
    public int getMin() {
    	return this.min;
    }
    
    public int getUtcOffset() {
    	return this.utcOffset;
    }
    
    public TimeType getTimeType() {
    	return this.type;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + hour;
		result = prime * result + min;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + utcOffset;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		if (type != other.type)
			return false;
		if (utcOffset != other.utcOffset)
			return false;
		return true;
	}

	public String toString() {
        return String.valueOf(this.hour) + " " + String.valueOf(this.min) + " " +
        		String.valueOf(this.utcOffset) + " " + String.valueOf(this.type);
    }
}
