import java.util.Objects;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return age == person.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
