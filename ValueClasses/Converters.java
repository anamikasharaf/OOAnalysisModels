package ValueClasses;

import java.util.*;

public class Converters {

	public static Quantity convert(Quantity q, double factor, Unit unit) {
		return new Quantity(q.getAmount() * factor, unit);
	}
	public static Quantity metersToMiles(Quantity q) throws Exception {
		if (!q.getUnit().equals(Unit.mile)) throw new Exception("incompatable units");
		return convert(q, 1/1609.24, Unit.meter);
		//return new Quantity(q.getAmount() / 1609.24, Unit.mile);
	}
	public static Quantity milesToMeters(Quantity q) throws Exception {
		if (!q.getUnit().equals(Unit.meter)) throw new Exception("incompatable units");
		return new Quantity(q.getAmount() * 1609.24, Unit.mile);
	}
	
}
