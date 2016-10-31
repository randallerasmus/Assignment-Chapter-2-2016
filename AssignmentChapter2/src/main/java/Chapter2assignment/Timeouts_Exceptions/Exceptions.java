package Chapter2assignment.Timeouts_Exceptions;

/**
 * Created by User on 2016/10/25.
 */
public class Exceptions {

    private boolean value;

    public Exceptions() {
    }

    public Exceptions(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exceptions that = (Exceptions) o;

        if (value != that.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (value ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Exceptions{" +
                "value=" + value +
                '}';
    }
}
