package Chapter2assignment.FloatingPoint;

/**
 * Created by User on 2016/10/25.
 */
public class FloatingPoint {
    private double value;

    public FloatingPoint() {
    }

    public FloatingPoint(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FloatingPoint that = (FloatingPoint) o;

        if (Double.compare(that.value, value) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "FloatingPoint{" +
                "value=" + value +
                '}';
    }
}
