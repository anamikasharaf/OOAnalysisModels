package ValueClasses;

import java.io.Serializable;
import java.math.*;
import java.util.function.*;

class Unit implements java.io.Serializable {
    public static Unit meter = new Unit("meter");
    public static Unit km = new Unit("kilometer");
    public static Unit mile = new Unit("mile");
    public static Unit second = new Unit("second");
    public static Unit fDegrees = new Unit("degrees Fahrenheit");
    public static Unit cDegrees = new Unit("degrees Celsius");

    private String name;

    public Unit(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Unit [name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Unit other = (Unit) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public Unit divide(Unit other) {
        return new CompoundUnit(this, UnitComposer.PER, other);
    }

}
