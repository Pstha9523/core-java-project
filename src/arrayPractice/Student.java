package arrayPractice;

import java.util.Objects;

public class Student {

    private String name;
    private int idNum;

    public Student (String name, int idNum){
        this.name = name;
        this.idNum = idNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idNum == student.idNum && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, idNum);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idNum=" + idNum +
                '}';
    }
}
