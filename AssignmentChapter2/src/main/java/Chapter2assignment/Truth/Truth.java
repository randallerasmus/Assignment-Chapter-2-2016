package Chapter2assignment.Truth;

/**
 * Created by User on 2016/10/25.
 */
public class Truth {

    private boolean value;

    public Truth() {
    }

    public Truth(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truth truth = (Truth) o;

        if (value != truth.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (value ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Truth{" +
                "value=" + value +
                '}';
    }
}
