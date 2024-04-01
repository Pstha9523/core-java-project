package genericClass;

import java.util.Objects;

public abstract class Triplet {

    //15. Create a simple generic class for Triplet.
    private String name;
    private String eyeColor;
    private double weight;
    private int age;

    public Triplet(String name, String eyeColor, double weight, int age){
        this.name = name;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triplet triplet = (Triplet) o;
        return Double.compare(weight, triplet.weight) == 0 && age == triplet.age && Objects.equals(name, triplet.name) && Objects.equals(eyeColor, triplet.eyeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, eyeColor, weight, age);
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "name='" + name + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
