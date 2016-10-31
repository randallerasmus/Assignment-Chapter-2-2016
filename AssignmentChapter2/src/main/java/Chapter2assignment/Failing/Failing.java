package Chapter2assignment.Failing;

/**
 * Created by User on 2016/10/25.
 */
public class Failing {

    private String name;

    public Failing() {

    }

    public Failing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Failing failing = (Failing) o;

        if (name != null ? !name.equals(failing.name) : failing.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Failing{" +
                "name='" + name + '\'' +
                '}';
    }
}
