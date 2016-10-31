package Chapter2assignment.Timeouts_Exceptions;

/**
 * Created by User on 2016/10/25.
 */
public class Timeout {

    private double height;
    private double width;

    public Timeout() {
    }

    public Timeout(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Timeout timeout = (Timeout) o;

        if (Double.compare(timeout.height, height) != 0) return false;
        if (Double.compare(timeout.width, width) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Timeout{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
