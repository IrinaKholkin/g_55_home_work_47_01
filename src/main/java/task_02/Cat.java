package task_02;

import java.util.Objects;

public class Cat {

    private final double weight;

    public Cat(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Double.compare(weight, cat.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }
}
