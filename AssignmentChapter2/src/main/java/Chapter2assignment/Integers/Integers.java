package Chapter2assignment.Integers;

/**
 * Created by User on 2016/10/25.
 */
public class Integers {

    private int value;

    public Integers() {
    }

    public Integers(int value) {
        this.value = value;
    }

    public int getValue() {

        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Integers integers = (Integers) o;

        if (value != integers.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "Integers{" +
                "value=" + value +
                '}';
    }
}
